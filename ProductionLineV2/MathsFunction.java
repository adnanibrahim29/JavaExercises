import java.util.Scanner;

public class MathsFunction {
    public static void main(String [] args){
        /*  
        a(n) = | a(1) = 2,              n = 1
               | a(n) = 4a(n-1)-3n,     n >= 2

        Given the Maths Function definition above for a mathematical function a(n) you are required to write two Java methods – 
        both methods will be in the same class.

        An iterative method which calculates a(n) for any positive value of n. In this method you must use either a for or a while loop.
        You should call this method q1Iterative and it should have a definition as follows: public static int q1Iterative(int n)

        A recursive method which calculates a(n) for any positive value of n. You should call this method q1Recursive. 
        The definition of the method should be declared as follows: public static int q1Recursive(int n)
        Both Java methods should only return the single value of a(n). They should not print any other values.

        Input
            n, an integer value.

        Sample Input 1
            1

        Output
        The method will print the value of a(n) for each method (which is a(1) in this case) on the same line separated by a space

        Sample Output 1
            2 2

        Sample Input 2
            5

        Output
        The method will print the value of a(n) for each method (which is a(5) in this case) on the same line seperated by a space

        Sample Output 2
            -79 -79 
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(q1Iterative(n)+ " " + q1Recursive(n));
    }
    public static int q1Iterative(int n){
        if(n == 1){
            return 2;
        } else {
            return 4 * q1Recursive(n - 1) - 3 * n;
        }
    }
    public static int q1Recursive(int n){
        if(n == 1){
            return 2;
        } else {
            return 4 * q1Recursive(n - 1) - 3 * n;
        }
    }
}
       
