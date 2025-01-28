import java.util.Scanner;

class Addiply {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)) {
            int testCases = Integer.parseInt(s.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                String nxtLine = s.nextLine();

                int num1 = Integer.parseInt(nxtLine.substring(0, nxtLine.indexOf(" ")));
                int num2 = Integer.parseInt(nxtLine.substring(nxtLine.indexOf(" ") + 1));

                String addiply = (num1 + num2) + " " + (num1 * num2);
                System.out.println(addiply);
            }
        }
    }
}
