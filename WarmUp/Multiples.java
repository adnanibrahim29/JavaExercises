package WarmUp;

public class Multiples {
    public static void main(String [] args){
        
        /* Write a Java program that uses a while loop to check for all numbers between 0 and 100 that are 
        (a): a multiple of 5 and 7, and 
        (b): a multiple of 5 or 7. 
        The program should print an appropriate message. 

        eg:
            0 is a multiple of 5 and 7
            5 is a multiple of 5 or 7
            7 is a multiple of 5 or 7
            10 is a multiple of 5 or 7

        */

        for(int num = 0; num <= 100; num++){
            if(num % 5 == 0 && num % 7 == 0){
                System.out.println(num + " is a multiple of 5 and 7");
            } else if(num % 5 == 0 || num % 7 == 0){
                System.out.println(num + " is multiple of 5 or 7");
            }
        }
    }
    
}
