import java.util.Scanner;

public class Exponent {
    public static void main(String [] args){

        /* 
        Write a recursive function named powerTo that accepts two integers representing a base and a power and returns the base raised to that power.

        For Example:

        powerTo(2, 3) -> 8
        powerTo(3, 3) -> 27
        powerTo(3, 4) -> 81

        Do not use loops or auxiliary data structures; solve the problem recursively.

        NOTE: You may not use Math.pow() to solve this question 
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a base number: ");
        int base = sc.nextInt();
        System.out.println();

        System.out.println("Enter a power number: ");
        int power = sc.nextInt();
        System.out.println();
        sc.close();

        System.out.println(powerTo(base, power));

    }

    public static int powerTo(int base, int power){
        if(power == 0){ // base 
            return 1; // If the power is 0
        }
        else{
            return base * powerTo(base, power - 1); // power - 1 -> counting down from the power
            // number of times 
        }
    }
}
