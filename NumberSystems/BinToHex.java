import java.util.Scanner;

public class BinToHex {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        /* 
        Binary numbers are numbers in base 2 (with digits: 1, 0)
        Hexadecimal numbers are numbers in base 16 (with digits: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)
        Write a Java program that converts a binary number to a Hexadecimal number and prints the Hexadecimal number to the screen. 
        Use keyboard input to provide the value for the binary number.

        Note: You are not allowed to use Integer.toHexString(), Integer.toString() or Integer.parseInt() to solve this problem.
        */

        System.out.println("Enter a binary number: ");
        int Binary = sc.nextInt();

        sc.close();

        int pos = 0;
        int sum = 0;

        while(Binary > 0){
            if(Binary % 10 == 1){ // If a value is equal to 1 when finding the remainder
                sum = sum + (int)Math.pow(2,pos); // Storing 2 to the power into sum variable
            }    
            pos++;
            Binary = Binary / 10; // Dividing the binary value each time
        }

       int pos2 = 0;
       int Decimal = sum;
       String HexVals = "0123456789ABCDEF";
       String HexNum = "";

        while(Decimal > 0){
            pos2 = Decimal % 16; // Getting the remainder of the decimal values 

            HexNum = HexVals.charAt(pos2) + HexNum; // Getting the postion of the hex string with the remainder

            Decimal = Decimal / 16; // Diving the decimal values 
       }

       System.out.println();
       System.out.println("The Hexadecimal value is: " + HexNum);  
    }
}
