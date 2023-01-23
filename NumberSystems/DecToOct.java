import java.util.Scanner;

public class DecToOct {
    public static void main(String [] args) {

        /* 
        Decimal numbers are numbers in base 10 (with digits: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        Octal numbers are numbers in base 8 (with digits: 0, 1, 2, 3, 4, 5, 6, 7)
        Write a Java program that converts a Decimal number to an Octal number and prints the Octal number to the screen. 
        Use keyboard input to provide the value of the Decimal number.

        Note: You are not allowed to use Integer.toString() or Integer.parseInt() to solve this problem. 
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int Decimal = sc.nextInt();

        sc.close();

        String OctalVal = "";

        while(Decimal > 0){
            int remainder = Decimal % 8; // Getting the remainder of decimal values
            OctalVal = remainder + OctalVal; // Storing the remainder back into the string 

            Decimal = Decimal / 8; // Dividing the decimal values
        }

        System.out.println();
        System.out.println("The Octal value is: " + OctalVal);




    }
}
