import java.util.Scanner;
class AreEuclidingMe {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int tCases = Integer.parseInt(s.nextLine());
            for (int tc = 0; tc < tCases; tc++) {
                String nxtLine = s.nextLine();
                int minuend = Integer.parseInt(nxtLine.substring(0,nxtLine.indexOf(",")));
                int subtrahend = Integer.parseInt(nxtLine.substring(nxtLine.indexOf(",") + 1));

                if (subtrahend > minuend) {
                    int temp = minuend;
                    minuend = subtrahend;
                    subtrahend = temp;
                }

                int difference = 0;
                while (minuend - subtrahend > 0) {
                    difference = minuend - subtrahend;
                    System.out.println(minuend + "-" + subtrahend + "=" + difference);
                    minuend = subtrahend;
                    subtrahend = difference;
                    if (subtrahend > minuend) {
                        int temp = minuend;
                        minuend = subtrahend;
                        subtrahend = temp;
                    }
                }
                difference = minuend - subtrahend;
                System.out.println(minuend + "-" + subtrahend + "=" + difference);

                if (minuend == 1 && subtrahend == 1) {
                    System.out.println("COPRIME");
                } else {
                    System.out.println("NOT COPRIME");
                }
            }
        }
    }
}
