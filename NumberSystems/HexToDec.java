import java.util.Scanner;

public class HexToDec {
    public static void main(String [] args) {

        /* 
        Hexadecimal numbers are numbers in base 16 (with digits: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)
        Decimal numbers are numbers in base 10 (with digits: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        Write a Java program that converts a Hexadecimal number to a Decimal number and prints the Decimal number to the screen.
        Use keyboard input to provide the value for the Hexadecimal number.

        Note: You are not allowed to use Integer.parseInt() or Integer.toString() to solve this problem. 
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a hexadecimal number: ");

        String hex = sc.nextLine().toUpperCase();

        int decimal = 0;
        String HexVals = "0123456789ABCDEF";
        int temp = 0;
        int increment = 0; 

        sc.close();
        
        for(int pos = hex.length() -1; pos >= 0; pos--){

            temp = HexVals.indexOf(hex.charAt(pos)); // Getting index position of the string by the user input

            decimal += Math.pow(16, increment) * temp; // Multiplying by 16 and incrementing the power

            increment++;
         
        }

        System.out.println();
        System.out.println("The Decimal value is: " + decimal);





    }
}
