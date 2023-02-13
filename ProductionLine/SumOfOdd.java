import java.util.Scanner;

public class SumOfOdd { 
    public static void main(String [] args) {

        /* 
        Write a Java program that will:

        1. Create a 2D array of a size that is decided by user input -
        the first number being the number of rows and the second number being the number of columns.
        2. Allow the user to fill the array with integers of their choice.
        3. Print to the screen the total number of odd numbers in the array. See the sample output for the format.
        4. Print the sum of all of the odd numbers in the array. See the sample output for the format.
        
        example 2D Array:

            | 1  1  1 11 |
            | 1 11  1  1 |
            | 1 11  2  1 |
            | 1 31 21  4 |

        Sample Input
            4 4 1 1 1 11 1 11 1 1 1 11 2 1 1 31 21 4 

        Sample Output
            Odd number count = 14
            Sum of odd numbers = 94
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of cols: ");
        int cols = sc.nextInt();

        int [][] arr = new int[rows][cols];

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                arr[r][c] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println();

        int Oddcount = 0, sum = 0;

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(arr[r][c] % 2 == 1 || arr[r][c] % 2 == -1) { // Checking if the number is an odd number
                    Oddcount++;
                    sum += arr[r][c];
                }
            }
        }

        System.out.println("Odd number count: " + Oddcount);
        System.out.println("Sum of of odd numbers: " + sum);
    }
}
