public class LinearEquation {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation (int x1, int x2, int y1, int y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    public double distance (){
        double dis = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        return roundedToHundredth(dis);
    }

    public double yIntercept(){
        double yInt = y1 - slope()*x1;
        return roundedToHundredth(yInt);

    }
    public double slope (){
        double slpe = ((double)y2 - y1)/((double)x2 - x1);
        return roundedToHundredth(slpe);
    }
    public String equation(){
        if (y1 == y2) {
            return "y = "+ yIntercept();

        }
        else {
            return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + yIntercept();
        }

    }
    public String coordinateForX(double x){
        double yV = (slope()*x)+yIntercept();
        yV = roundedToHundredth(yV);
        return "("+x +", " + yV+")";
    }
    public String  lineInfo(){
        return "The two points are: ("+ x1 +", "+y1+")  and ("+ x2 +", "+y2+")\n The equation of the line between these points is: "+equation()+"\n The slope of this line is: "+slope()+"\n The y-intercept of this line is: "+yIntercept()+"\n The distance between these points is " +distance ();

    }
    private double roundedToHundredth(double toRound){
        return Math.round(toRound * 100) / 100.0;
    }





}