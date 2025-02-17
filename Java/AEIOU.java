package Java;
import java.util.Scanner;

class AEIOU {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)) {
            int tCases = Integer.parseInt(s.nextLine());
            for (int tCase = 0; tCase < tCases; tCase++) {
                String nxt = s.nextLine();
                String vowels = "A|E|I|O|U|a|e|i|o|u";

                int j = 0;
                for (int i = 0; i < nxt.length(); i++) {
                    if (nxt.substring(i,i+1).matches(vowels)) {
                        j++;
                    }
                }

                System.out.println(j);
            }
        }
    }
}
