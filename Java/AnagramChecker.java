package Java;
import java.util.Scanner;

class AnagramChecker {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int tCases = Integer.parseInt(s.nextLine());
            for (int t = 0; t < tCases; t++) {
                String nxt = s.nextLine();

                String first = nxt.substring(0,nxt.indexOf("|"));
                String second = nxt.substring(nxt.indexOf("|") + 1);
                boolean anagram = true;

                if (first.equals(second) || first.length() != second.length()) {
                    System.out.println(nxt + " = NOT AN ANAGRAM");
                } else {
                    int i = 0;
                    int len = first.length();
                    while (i < len) {
                        if (second.indexOf(first.substring(0,1)) > -1) {
                            second = second.substring(0,second.indexOf(first.substring(0,1))) + second.substring(second.indexOf(first.substring(0,1)) + 1);
                            first = first.substring(1);
                            i++;
                        } else {
                            System.out.println(nxt + " = NOT AN ANAGRAM");
                            anagram = false;
                            break;
                        }
                    }
                    if (anagram) {
                        System.out.println(nxt + " = ANAGRAM");
                    }
                }
            }
        }
    }
}