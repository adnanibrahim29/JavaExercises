import java.util.Scanner;

public class SmallerNumbers {
    public static void main(String [] args) {

        /* 
        Write a Java program that asks the user to enter 10 numbers. The program should count how many times a smaller number 
        is entered after a larger number. An appropriate message with the result should be printed.
        */

       

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int previous = Integer.MIN_VALUE; // Integer.MIN_VALUE finds the smallest number 

        for(int i = 0; i < 10; i++){ // Getting the user to input numbers 10 times 
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            if(num < previous){
                count++;
            }
            // Updating back into the num 
            previous = num; // Initialising previous variable back into the num variable when the user inputs 
        }

        sc.close();

        System.out.println();

        System.out.println("A smaller number was entered after a larger number " + count + " times ");

    }
}
