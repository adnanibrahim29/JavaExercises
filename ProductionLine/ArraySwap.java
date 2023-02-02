import java.util.Scanner;

public class ArraySwap {
    public static void main(String [] args) {
        /* 
        Write a Java program that creates an integer array of size 5. The value of each position should be filled with user input. 
        This array should be printed to the screen. 
        You should then swap the first and last elements in the array and print it to the screen on a new line. See sample output for format.
        */

        Scanner sc = new Scanner(System.in);
        int [] input = new int[5];

        for(int i = 0; i < input.length; i++){
            System.out.println("Enter a number: ");
            input[i] = sc.nextInt();
        }

        sc.close();
        System.out.println();

        for(int i = 0; i < input.length; i++){ // Printing out in order 
            System.out.print(input[i] + " ");
        }

        System.out.println();

        int temp = input[0]; // Using temp to store the first position
        input[0] = input[4]; // Getting the first equal to last postion 
        input[4] = temp; // Swapping the first and last postion
        
        for(int i = 0; i < input.length; i++){ // Printing the array list with swapped postions 
            System.out.print(input[i] + " ");
        }
    }
}
