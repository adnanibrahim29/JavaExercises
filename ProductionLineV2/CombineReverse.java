import java.util.Scanner;

public class CombineReverse {
    public static void main(String [] args){
        /* 
        Write a Java program, called CombineReverse that contains a static method called combine() that accepts a single non-negative 
        integer as its parameter and returns the long integer combined with the integer in reverse. The input parameter should be read in 
        from the user in the main method and passed to the combine() method. The main method should print the combined integer to the screen. 
        If the input is negative an error message should print to the screen stating “Not a valid entry!”

        Sample Input
            427

        Sample Output
            427724
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        sc.close();

        System.out.println();

        if(combine(input) < 0){
            System.out.println("Not a valid entry!");
        }else{
            System.out.print(input + "" + combine(input));
        }
    }
    public static int combine(int input){
        int rev = 0;
        
        do{
            int digit = input % 10; // Getting last digit from input
            rev = rev * 10 + digit;

            input /= 10; // Removing the last digit from input
        }while(input != 0);
        return rev;
    }
}
