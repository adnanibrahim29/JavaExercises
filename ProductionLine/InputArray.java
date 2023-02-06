import java.util.Scanner;

public class InputArray {
    public static void main(String [] args) {
        
        /* 
        Write a program that:

            Takes the array size as input from the user, (use the Scanner class)
            Creates an int array of that size,
            Populates it with values, prompting the user for each value.

            Prints the largest number in the array and also prints the index of the largest number in the array, like so: a[0] = 24 is the largest.
            Prints out the index of any 5s in the array, so for the following array (24 2 6 5 7 8 5 5), the indices of the fives are 3 6 7.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int len = sc.nextInt();

        int [] inputs = new int[len];

        System.out.println("Enter values: ");
        for(int i = 0; i < len; i++){
            inputs[i] = sc.nextInt();
        }

        sc.close();
        System.out.println();

        System.out.println("values: ");
        for(int i = 0; i < len; i++){
            System.out.println("Position " + i + ": " + inputs[i]);
        }

        int max = inputs[0]; // Assuming largest value is at pos 0 
        int indexVal = 0;
        for(int i = 0; i < len; i++){
            if(inputs[i] > max){ // If inputs val at i is bigger than current max val
                max = inputs[i]; // Making current max val equal to current input val
                indexVal = i; // Getting the index val at i
            }
        }
        System.out.println();
        System.out.println("a[" + indexVal + "]= " + max + " is the largest");

        System.out.println();
        System.out.println("The indices of the fives are ");
        for(int i = 0; i < len; i++){
            if(inputs[i] == 5){
                System.out.print(i + " ");
            }
        }
    }
}
