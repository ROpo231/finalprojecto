import java.util.Scanner;
public class LinearEquationLogic {
    private LinearEquation linear;
    private Scanner scan;




    public LinearEquationLogic() {
         scan = new Scanner(System.in);
         linear = null;
    }
    public void start(){
        repeat();
    }
    private void gettingVar (){
        System.out.println("Welcome, please enter your corrdinaites below.");
        System.out.print("Enter your first corrdinaite: " );
        String firCord = scan.nextLine();
        System.out.print("Enter your second corrdinaite: " );
        String secCord = scan.nextLine();
        int x1 = Integer.parseInt(firCord.substring(1, firCord.indexOf(",")));
        int x2 = Integer.parseInt(secCord.substring(1, firCord.indexOf(",")));
        int y1 = Integer.parseInt(firCord.substring(firCord.indexOf(" ")+1, firCord.indexOf(")")));
        int y2 = Integer.parseInt(firCord.substring(secCord.indexOf(" ")+1, secCord.indexOf(")")));
        linear = new LinearEquation(x1, x2, y1, y2);
        System.out.println(linear.lineInfo());
        gettingCord();

    }
    private void gettingCord(){
        boolean y = true;
        while (y){
            System.out.println("Enter a x valuse to find the corridente on the line: ");
            double xCord = scan.nextDouble();
            System.out.println(linear.coordinateForX(xCord));
            System.out.println("Would you like to go again? y/n : ");
            String resPo = scan.nextLine();
            if(!resPo.equals("y")){
                y = false;
            }
        }


    }
    private void repeat(){
        boolean z = true;
        while (z) {
            gettingVar();
            System.out.println("Would you like to go again to put new corrdinates? y/n : ");
            String fin = scan.nextLine();
            if (!fin.equals("y")) {
                z = false;
            }
        }
    }

}
