import java.util.Scanner;

public class Decode {
    public static void main(String [] args) {

        /*  
        Write a java program that:

        Prints to the screen the character equivalence of an inputted decimal value. The format of the output can be seen below.
        Stops printing when the decimal value for 'ESC' (27) is inputted.
        
        Note:
        Your program will receive decimal numbers as user input.
        You must convert these numbers to characters to their ASCII character value.
        They must be printed in the order of being input with one space after each.
        You will stop receiving input when you receive the decimal value for 'ESC', and you do not print this.
        */

        Scanner sc = new Scanner(System.in);
        
        int decimalVal;

        do{
            System.out.println("Enter a decimal value: ");
            decimalVal = sc.nextInt();

            if(decimalVal != 27){
                System.out.println((char)decimalVal + " ");
            }
        }while(decimalVal != 27);
        sc.close();
        
    }
}
