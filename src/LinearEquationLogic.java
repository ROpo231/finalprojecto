import java.util.Scanner;
public class LinearEquationLogic {
    private LinearEquation linear;
    private Scanner scan;
    private int x1;
    private int x2;




    public LinearEquationLogic() {
        scan = new Scanner(System.in);
        linear = null;
    }
    public void start(){
        repeat();
    }
    private void gettingVar (){
        System.out.print("Enter your first coordinates: " );
        String firCord = scan.nextLine();
        System.out.print("Enter your second coordinates: " );
        String secCord = scan.nextLine();

        String firCordx1 = firCord.substring(1, firCord.indexOf(","));
        String secCordx2 = secCord.substring(1, secCord.indexOf(","));
        String firCordy1 = firCord.substring(firCord.indexOf(",")+2, firCord.indexOf(")"));
        String secCordy2 = secCord.substring(secCord.indexOf(",")+2, secCord.indexOf(")"));
        x1 = Integer.parseInt(firCordx1);
        x2 = Integer.parseInt(secCordx2);
        int y1 = Integer.parseInt(firCordy1);
        int y2 = Integer.parseInt(secCordy2);


        linear = new LinearEquation(x1, y1, x2, y2);
        if(x1 == x2){
            System.out.println("Error needs different x values to be inputed");
        }
        else {
            System.out.println(linear.lineInfo());
            gettingCord();
        }

    }
    private void gettingCord(){
        if(x1 == x2){


        }
        else {
            boolean s = true;
            while (s) {
                System.out.print("Enter a x value to find the coordinates on the line: ");
                double xCord = scan.nextDouble();
                System.out.println(linear.coordinateForX(xCord));
                scan.nextLine();
                System.out.println("Would you like to go again? y/n : ");
                String resPo = scan.nextLine();
                if (!resPo.equals("y")) {
                    s = false;
                }
            }
        }


    }
    private void repeat(){
        System.out.println("Welcome, please enter your coordinates below.");
        boolean z = true;
        while (z) {
            gettingVar();
            System.out.println("Would you like to go again to put new coordinates? y/n : ");
            String fin = scan.nextLine();
            if (!fin.equals("y")) {
                z = false;
            }
        }
        System.out.println("Goodbye");

    }

}




