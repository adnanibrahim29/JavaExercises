import java.util.Scanner;

public class LargestRow { 
    public static void main(String [] args) {

        /* 
        Write a Java program that will:

        Create a square integer 2D array of a size that is decided by user input.
        Allow the user to fill the array with integers of their choice.
        Determine which row has the largest sum.
        Print to the screen a string starting with "R" and then the number of the row with no spaces. For example "R2".
        
        Example 2D Array:

            | 1 2 |
            | 3 4 |

        Sample Input
            2 1 2 3 4 

        Sample Output
            Largest row = R2 
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size= sc.nextInt();
        int [][] arr = new int[size][size];

        System.out.println("Enter values: ");
        for(int r = 0; r < size; r++){
            for(int c = 0; c < size; c++){
                arr[r][c] = sc.nextInt();
            }
        }
        sc.close();
        
        System.out.println();

        int largestRow = 0;
        for(int r = 0; r < size; r++){

            int rowSum = 0;
            for(int c = 0; c < size; c++){
                rowSum += arr[r][c];
            }

            if(rowSum > largestRow){
                largestRow = r + 1; // Making sure the largestrow starts at 1
            }
        }

        System.out.println("Largest row = R" + largestRow);
    }
}
