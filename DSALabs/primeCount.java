// Lab 3 - Week 3

import java.util.Scanner;

public class primeCount {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start of range: ");
        int start = sc.nextInt();
        System.out.println("Enter end of range");
        int end = sc.nextInt();
        int count = 0;
        
        // Checking if start is less than or equal to 0 or end is less than or equal to 0 or start is bigger than end
        while(start < 0 || end < 0 || start > end){ 
            if(start < 0){
                System.out.println("Re-Enter Start of Range -> greater than 0");
                start = sc.nextInt();
            }else if(end < 0){
                System.out.println("Re-Enter End of Range -> greater than 0");
                end = sc.nextInt();
            }else if(start > end){
                int temp = start;
                start = end;
                end = temp;
            }
        }
        
        for(int n = start; n <= end; n++){ // Between the range 
            if(n == 0){
                n++;
            }else if(n == 1){
                n++;
            }
            else if(range(n)){ // If there is any prime numbers in that range then print it out
                System.out.print(n + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total: " + count);
        sc.close();
    
    }

    public static boolean range(int num){ // Finding the Prime number 

        for(int i = 2; i <= num/i; i++){ // Loop to interate from 2 to the square root of num

            if(num % i == 0){ // Checking if num can be divided

                return false; // Return false when num can be divived 
            }
        }
        return true; // Return true when num cannot be divided and is a prime number
    }
}
