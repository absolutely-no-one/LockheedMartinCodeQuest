import java.util.Scanner;

class NotSoSelfDriving {
   public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
         int testCases = Integer.parseInt(input.nextLine());
         
         for (int testcase = 0; testcase < testCases; testcase++) {
            String s = input.nextLine();
            double v = Double.parseDouble(s.substring(0, s.indexOf(":")));
            
            s = s.substring(s.indexOf(":") + 1);
            
            double x = Double.parseDouble(s);
            
            if (v >= x) {
               System.out.println("SWERVE");
            } else if (v * 5.0 >= x) {
               System.out.println("BRAKE");
            } else {
               System.out.println("SAFE");
            }
            
         }
      }
   }
}

