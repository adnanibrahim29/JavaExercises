import java.util.Scanner;

public class SumDigits {
    public static void main(String [] args){
        /* 
        Write a recursive method (no loops) which takes in a non-negative integer and returns the sum of all the digits in a number. 
        You should call this method recursiveSum.

        For Example: recursiveSum(126) would return 9 as 1 + 2 + 6 = 9 
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        sc.close();
        
        System.out.println();
        System.out.println(recursiveSum(input));
    }
    public static int recursiveSum(int input){
        if(input == 0){
            return 0;
        } else{
            return input % 10 + recursiveSum(input / 10);
        }
    }
}
