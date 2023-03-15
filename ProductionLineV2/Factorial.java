import java.util.Scanner;

public class Factorial {

    public static void main(String [] args){
        /* 
        Write a Java program, called Factorial that contains a static method called getFactorial(). 
        The getFactorial() method should accept an integer value x as a parameter. It will return nothing and print the factorial of the 
        input parameter to the screen. The main method should read in user input in the form of two integer numbers, n, and m. When the code
        executes the factorial of all numbers from n up to m should be printed to the screen each on a new line using a loop. If either of 
        the user inputs is negative, an error message should print to the screen stating “Not Valid!”

        NOTE: Output must match exactly

        Input
            n m , where n and m are integer values
        
            Sample Input
            2 5
        
        Output
            The Factorial of all numbers from n up to m
        
        Sample Output
            2
            6
            24
            120
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        sc.close();

        System.out.println();

        if(num1 < 0 || num2 < 0){
            System.out.println("Not Valid!");
        }else{
            for(int i = num1; i <= num2; i++){
                System.out.println(getFactorial(i));
            }
        }
    }
    public static int getFactorial(int input){
        int factorial = 1;
        for(int i = 1; i <= input; i++){
            factorial *= i;
        }return factorial;
    }
}
