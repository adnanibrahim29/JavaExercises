public class BreakPal { 
    public static void main(String [] args) {

        /* 
        Write a Java program that determines and prints the digits that make up every five-digit palindromic number that is divisible by 53. 
        For example, for the palindromic number 74147 the program should print:

        74147
        7
        4
        1
        4
        7
        ********** 
        */

        System.out.println();
        for(int i = 10001; i < 100000; i++){
            if(i % 53 == 0){
                System.out.println(i);
                System.out.println(i / 10000); // First digit
                System.out.println(i % 10000 / 1000); // Second digit 
                System.out.println(i % 1000 / 100); // Third Digit
                System.out.println(i % 100 / 10); // Fourth digit 
                System.out.println(i % 10); // Fifth digit
                System.out.println("**********"); 
                System.out.println();
            }
        }
    }
}
