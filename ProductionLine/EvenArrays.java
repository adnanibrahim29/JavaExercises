import java.util.Scanner;

public class EvenArrays {
    public static void main(String [] args) {

        /* 
        Write a Java program that will create an array of size 10 and into it put the first 10 even numbers 
        greater than a given user input. 
        The user should then be repeatedly prompted to enter a position and the program should print out the array
        value at that position to the screen. 
        If an invalid entry is entered an appropriate message should be printed to the screen ("No such index!"). 
        The program should stop when the user inputs the value -1.

        Important Note: You must use while loops only to solve this question. 
        DO NOT USE A FOR LOOP IN THIS PROBLEM
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt() + 1; // Adding one to the input
        int [] num = new int[10];

        int evenPos = 0; // Index Postion

        if(input % 2 == 0){ // If the number is an even number
            while(evenPos < 10){
                num[evenPos] = input; // Making num in the array equal to the input
                input = input + 2; // Adding 2 to get the even numbers
                evenPos++; // Updating the position
            }
        } else{ // If the number is an odd number
            input = input + 1; // Add 1 to make an even number

            while(evenPos < 10){
                num[evenPos] = input;
                input = input + 2;
                evenPos++;
            }
        }

        while(true){ // Keeps repeating until users -1
            System.out.println("Enter a postion or" + " -1 to quit: " );
            int inputVal = sc.nextInt();
            if(inputVal == -1){ // If user input -1 then code breaks
                break;
            }
            if(inputVal >= 0 && inputVal < 9){ // If user enters between 0 and 9 
                System.out.println("Position " + inputVal + ": " + num[inputVal]);
            } else if(inputVal > 9){ // If user enters a number greater than 9 
                System.out.println("Position " + inputVal + ": No Such index!" );
            }
        }
        sc.close();
    }
}
