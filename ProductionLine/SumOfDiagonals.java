import java.util.Scanner;

public class SumOfDiagonals { 
    public static void main(String [] args) {

        /* 
        Write a Java program that will:

        Create a square 2D array of a size that is decided by user input - the first number being the number of rows.
        Allow the user to fill the array with integers of their choice.
        Print to the screen the sum of the diagonals. For example see below
        Example 2D Array:

            |  1  2  3  4 |
            |  5  4  6  9 |
            | 11 13 16  6 |
            |  2  4 18 20 |

        Diagonal 1 = 1, 4, 16, 20. Diagonal 2 = 4, 6, 13, 2. The sum of Diagonal 1 is 41. (1 + 4 + 16 + 20) The sum of Diagonal 2 is 25. (4 + 6 + 13 + 2) The sum of both diagonals is 66.
        You would return 66, the sum of both diagonals only.

        Sample Input
            4 1 2 3 4 5 4 6 9 11 13 16 6 2 4 18 20 

        Sample Output
            Sum of diagonals = 66 
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");

        int size = sc.nextInt();
        int [][] arr = new int[size][size];

        System.out.println("Enter values: ");
        for(int r = 0; r < size; r++){
            for(int c = 0; c < size; c++){
                arr[r][c] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println();

        int sum = 0;

        for(int r = 0; r < arr.length; r++){
            sum += arr[r][r]; // array is equivalent to the i-th row and i-th column
            sum += arr[r][size - r -1]; // This is equivalent at the intersection for the i-th row and size - i -1 
        }

        System.out.println();
        System.out.println("Sum of diagonals = " + sum);
    }
}
