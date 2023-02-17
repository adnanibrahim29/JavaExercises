import java.util.Scanner;

public class DotProduct {
    public static void main(String [] args) {

        /* 
        Write a Java program to perform the dot product on a 4x4 2D array. Your program should create the integer array and perform the multiplication. The integers should be read in from the user. 
        The results of the multiplication should be stored in a 4x4 array and upon completion should be printed to the screen.

        To perform the dot product, multiple each element in the matrix by a scalar.

        Sample Input
            1 5 9 5 3 6 9 2 4 2 8 1 6 9 6 3
            3

        Sample Output
            3 15 27 15
            9 18 27 6
            12 6 24 3
            18 27 18 9
        */

        Scanner sc = new Scanner(System.in);

        int [][] arr = new int[4][4]; // Declaring the size of the array
        System.out.println("Enter a scaler number: ");
        int scaler = sc.nextInt();

        System.out.println("Enter values: ");
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr.length; c++){
                arr[r][c] = sc.nextInt(); // Inputing the values to the array
            }
        }
        sc.close();

        System.out.println();

        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr.length; c++){
                arr[r][c] *= scaler; // multiplying the array by the scaler value
            }
        }

        for(int r = 0; r < arr.length; r++){ // Printing out the array
            for(int c = 0; c < arr.length; c++){
               System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
}
