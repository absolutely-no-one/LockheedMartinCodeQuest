// AnimalFarm.java

import java.util.Scanner;

class AnimalFarm {
   public static void main(String[] args) {
      try (Scanner s = new Scanner(System.in)) {
         int tCases = Integer.parseInt(s.nextLine());
         
         for (int tcase = 0; tcase < tCases; tcase++) {
            String nxtLine = s.nextLine();
            
            int t = Integer.parseInt(nxtLine.substring(0,nxtLine.indexOf(" ")));
            nxtLine = nxtLine.substring(nxtLine.indexOf(" ") + 1);
            
            int g = Integer.parseInt(nxtLine.substring(0,nxtLine.indexOf(" ")));
            nxtLine = nxtLine.substring(nxtLine.indexOf(" ") + 1);
            
            int h = Integer.parseInt(nxtLine.substring(0));
            
            System.out.println(t * 2 + g * 4 + h * 4);
         }
      }
   }
}