public class LinearEquation {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation (int x1, int y1, int x2, int y2){
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
        if (y2 - y1 == 0 || (x2 ==0 && x1 == 0) ){
            return 0;
        }
        double slpe = ((double) y2 - y1) / ((double) x2 - x1);
        return roundedToHundredth(slpe);

    }
    public String equation(){
        int ySlope =(y2 - y1) ;
        int xSlope = (x2 - x1);
        String signn = " + ";
        String sSlope =  ySlope + "/" + xSlope + "x";
        String endYInt ="" + yIntercept();
        double yIntt = yIntercept();
        if ((x2 - x1) < 0){
            ySlope = (y2 - y1) * -1;
            xSlope = (x2 - x1) * -1;
        }


        if (slope() > 0){
            if ((x2 - x1) < 0 && (y2 - y1) < 0){
                sSlope = ((y2-y1)*-1) + "/" + ((x2-x1)*-1) + "x";
            }
        }

        else {
            if ((x2-x1) < 0){
                sSlope = ((y2-y1)*-1) + "/" + ((x2-x1)*-1) + "x";
            }
        }
        if (slope()%1==0 ){
            sSlope = (int)slope() + "x";
        }
        if (slope() == -1) {
            sSlope = "-x";
        }
        if (slope() ==1){
            sSlope = "x";
        }
        if (slope()==0){
            sSlope = "";
            signn = "";
        }

        if (yIntercept() == 0  ){
            if (slope()==0){
                endYInt = "0";
                sSlope = "";

            }
            else{
                endYInt = "";
                signn = "";

            }

        }

        if (yIntercept() < 0){
            endYInt = " - " +(yIntercept()*-1);
            signn = "";
            if (slope()==0){
                endYInt = "-" +(yIntercept()*-1);
                signn = "";
            }

        }




        return "y = " +sSlope+ signn + endYInt;

    }





    public String coordinateForX(double x){

        double yV = (slope()*x)+yIntercept();
        yV = roundedToHundredth(yV);
        return "("+x +", " + yV+")";
    }
    public String  lineInfo(){
        if(x1==x2){
            return "These points are on vertical line: x = " + x1;
        }
        else {

            return "The two points are: (" + x1 + ", " + y1 + ")  and (" + x2 + ", " + y2 + ")\n The equation of the line between these points is: " + equation() + "\n The slope of this line is: " + slope() + "\n The y-intercept of this line is: " + yIntercept() + "\n The distance between these points is " + distance();
        }
    }
    private double roundedToHundredth(double toRound){
        return Math.round(toRound * 100) / 100.0;
    }





}










