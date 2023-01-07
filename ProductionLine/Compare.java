import java.util.Scanner;

public class Compare {
    public static void main(String [] args) {
        
        /* 
        Write a program that takes two integer inputs from the user and tells if the first number 
        is greater than,equal to or less than the second number. 
        */

        Scanner sc = new Scanner(System.in); // Getting the user to input 

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        sc.close();

        System.out.println();

        if(num1 < num2){ 
            System.out.println(num1 + " < " + num2);
        } else if(num1 > num2){
            System.out.println(num1 + " > " + num2);
        } else if(num1 == num2 ){
            System.out.println(num1 + " = " + num2);
        }
    }
}