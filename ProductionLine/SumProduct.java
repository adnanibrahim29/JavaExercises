import java.util.Scanner;

public class SumProduct {
    public static void main(String [] args) {
        /*  
        Write a Java program that will:

        Create an integer array of a size that is decided by user input.
        Allow the user to fill the array with integers of their choice.
        Print to the screen the sum and product of all the elements of the array. See the sample output for the format.
        Print to the screen the largest number of the user's inputted numbers. See sample output.
        
        Sample Input – first value is the array size entered by the user
            5
            2
            3
            7
            1
            1

        Sample Output
            Sum: 14
            Product: 42
            Largest Number: 7
        */
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array:");
        int len = sc.nextInt();

        int [] nums = new int[len];
        for(int i = 0; i < nums.length; i++){
            System.out.println("Enter a number: ");
            nums[i] = sc.nextInt();

        }
        sc.close();

        System.out.println();

        int sum = 0;
        int product = 1;
        int max = nums[0]; 

        for(int i = 0; i < nums.length; i++){ // Looping through the array
            sum += nums[i]; // Getting the sum
            product *= nums[i]; // Getting the product
            if(nums[i] > max){ // If the current nums value is bigger than the current max value
                max = nums[i]; // Max is the new current value 
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Largest Number: " + max);
    }
}
