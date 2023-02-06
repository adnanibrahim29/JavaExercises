import java.util.Scanner;

public class Clumps {
    public static void main(String [] args) {

        /* 
        Write a java program which will print to the screen the largest "clump" that appears in an array. A "clump" in an array 
        is a sequence of 2 or more adjacent elements with the same value. The size of the array is decided by user input and the elements are also decided by user input.

        For example:

            [1, 2, 2, 3, 4, 4] → 2 (Biggest Clump Size: 2)
            [1, 1, 2, 1, 1] → 2 (Biggest Clump Size: 2)
            [1, 1, 1, 1, 1] → 1 (Biggest Clump Size: 5)
            [3, 3, 3, 1, 1, 2, 4, 4, 4] → 3 (Biggest Clump Size: 3)
        
            Sample Input:
            5
            3
            3
            4
            5
            5
            
            Sample Output:
            Biggest Clump Size: 2 
        */

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array");
            int size = sc.nextInt();
            int [] input = new int[size];

            System.out.println("Enter numbers in the array:");
            for(int i = 0; i < input.length; i++){
                input[i] = sc.nextInt();
            }
            sc.close();
            System.out.println();

            int Clumps = 1, BiggestClumps = 0;
            for(int i = 0; i < input.length - 1; i++){
                if(input[i] == input[i + 1]){ // If the current element is equal to the next element is part of the clump
                    Clumps++; // If it is part of the clump then storing the clump 
                }
                else { // If the current element is not equal to the next element 
                    if(BiggestClumps < Clumps){ // If the current clumps is bigger than the largest clump
                        BiggestClumps = Clumps; // Then the largest clump is updated to the current clump
                    }
                    Clumps = 1; // Clump rsets back to 1 since a new clump starts
                }
            }
        System.out.println("Biggest Clumps: " + BiggestClumps);
    }
}
