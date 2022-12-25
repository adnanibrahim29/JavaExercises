package WarmUp;

public class Quadratic {
    public static void main(String [] args){

        /*  
        use the -b formula to solve for x 
        use double to help find x
        An equation has 0 solutions if the sum in the square root is negative
        */

        double a = 1;
        double b = 0;
        double c = -1;

        double first = -b;

        double SquareRoot = Math.pow(b, 2) - 4 * a * c;

        double div = 2 * a;

        if(SquareRoot < 0){
            System.out.println("No Solutions");
        }else{
            // combining the whole formula 
            System.out.println("x = " + (first + (Math.sqrt(SquareRoot) / div)));
            System.out.println("x = " + (first - (Math.sqrt(SquareRoot) / div)));
        }

        

    



    }
    
}
