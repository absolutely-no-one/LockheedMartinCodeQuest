import java.util.Scanner;

class BishopsMove {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
           int tCases = Integer.parseInt(s.nextLine());
           
           for (int tcase = 0; tcase < tCases; tcase++) {
              String nxtLine = s.nextLine();
              int rows = Integer.parseInt(nxtLine.substring(0,nxtLine.indexOf(",")));
              int cols = Integer.parseInt(nxtLine.substring(nxtLine.indexOf(",") + 1));

              String currPos = s.nextLine();

              int x1 = Integer.parseInt(currPos.substring(0,currPos.indexOf(",")));
              int y1 = Integer.parseInt(currPos.substring(currPos.indexOf(",") + 1));

              String endPos = s.nextLine();
              int x2 = Integer.parseInt(endPos.substring(0,endPos.indexOf(",")));
              int y2 = Integer.parseInt(endPos.substring(endPos.indexOf(",") + 1));

              if ((Math.abs(x2 - x1) % 2 == 0 && Math.abs(y2 - y1) % 2 == 0) || (Math.abs(x2 - x1) % 2 == 1 && Math.abs(y2 - y1) % 2 == 1)) {
                if (x1 <= rows && x2 <= rows && y1 <= cols && y2 <= cols) {
                    System.out.println("Yes");
                }
              } else {
                System.out.println("No");
              }

           }
        }
     }
}
