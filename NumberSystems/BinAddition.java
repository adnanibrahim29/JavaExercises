import java.util.Scanner;

public class BinAddition {
    public static void main(String [] args) {

        /* 
        Binary numbers are numbers in base 2 (with digits: 1, 0)
        Write a Java program that performs binary addition on two binary numbers. Use keyboard input to provide the value for the 2 binary numbers.
        */

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first binary number:");
        String first = sc.nextLine();

        System.out.println();
        System.out.println("Enter the second binary number:");
        String second =  sc.nextLine();

        sc.close();

        int num1 = Integer.parseInt(first, 2); // Converting the string into binary (base 2)
        int num2 = Integer.parseInt(second, 2); 

        int value = num1 + num2;

        System.out.println();
        System.out.println(Integer.toBinaryString(value));
    }
    
}
