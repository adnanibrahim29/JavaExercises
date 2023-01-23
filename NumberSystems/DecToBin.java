import java.util.Scanner;

public class DecToBin {
    public static void main(String [] args) {

        /* 
        Decimal numbers are numbers in base 10 (with digits: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        Binary numbers are numbers in base 2 (with digits: 1, 0)
        Write a Java program that converts a Decimal number to a Binary number and prints the Binary number to the screen.
        Keyboard input should provide the value for the Decimal number.

        Note: you are not allowed to use Integer.toString(), Integer.toBinaryString() or Integer.parseInt() to solve this problem.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = "";
        sc.close();

        while(decimal > 0){ // Dividing the number by 2 and storing the remainder 
          int remainder = decimal % 2; // Getting the remainder
          binary = remainder + binary; // Concatating the remainde to the left 
          decimal = decimal / 2; // Updating the decimal number
    
        }

        System.out.println();
        System.out.println("The Binary value is: " + binary);



    }
}