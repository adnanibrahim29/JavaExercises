import java.util.Scanner;

public class DoubleSize {
    public static void main(String [] args){
        /* 
        Write a static method called determineSize() that accepts two doubles. The method should print a message to the screen that states which number is the smallest, 
        which is the biggest or that they are the same number. Test the method by calling it from the main method using user input.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter a double number: ");
        double num2 = sc.nextDouble();
        sc.close();

        determineSize(num1, num2);
    }
    public static void determineSize(double num1, double num2){

        System.out.println();
        if(num1 > num2){
            System.out.println("Biggest: " + num1);
            System.out.println("Smallest: " + num2);
        }else if(num2 > num1){
            System.out.println("Biggest:" + num2);
            System.out.println("Smallest: " + num1);
        }else{
            System.out.println("Numbers are the same");
        } 
    }
}
