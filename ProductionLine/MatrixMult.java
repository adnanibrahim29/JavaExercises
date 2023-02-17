import java.util.Scanner;

public class MatrixMult { 
    public static void main(String [] args) {

        /* 
        Write a Java program to perform matrix multiplication on two 4x4 2D arrays. Your program should create the two integer arrays and perform the multiplication. 
        The integers should be read in from the user. The results of the multiplication should be stored in a 4x4 array and upon completion should be printed to the screen.

        To perform matrix multiplication multiply each row in the first matrix (2D array) with the corresponding column in the second matrix and sum up the results.
        That is, multiply the first value of the first row with the first value in the first column, multiply the second value of the first
        row with the second value in the first column... and sum up the results.

        Sample Input
            1 5 9 5 3 6 9 2 4 2 8 1 6 9 6 3
            3 7 0 5 3 6 9 6 3 7 5 1 4 4 2 8

        Sample Output
            65 120 100 84
            62 128 103 76
            46 100 60 48
            75 150 117 114 
        */

        Scanner sc = new Scanner(System.in);

        int [][] arr1 = new int[4][4];
        int [][] arr2 = new int[4][4];
        int [][] result = new int[4][4];

        System.out.println("Enter first array: ");
        for(int r = 0; r < arr1.length; r++){
            for(int c = 0; c < arr1.length; c++){
                arr1[r][c] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Enter second array: ");
        for(int r = 0; r < arr2.length; r++){
            for(int c = 0; c < arr2.length; c++){
                arr2[r][c] = sc.nextInt();
            }
        }

        sc.close();
        int sum = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++){
                        // Rows, Cols       Rows, Cols
                  /*  firstX = arr1[j][k];
                    firstY = arr2[k][i];
                    multiply = firstX * firstY;
                    sum += multiply; */

                    sum += arr1[j][k] * arr2[k][i];
                }
                result[j][i] = sum;
                sum = 0;
            }
        }

        System.out.println();
        for(int r = 0; r < 4; r++){
            for(int c = 0; c < 4; c++){
                System.out.print(result[r][c] + " ");
            }
            System.out.println();
        }
    }   
}
