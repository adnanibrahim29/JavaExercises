import java.util.Scanner;
import java.text.DecimalFormat;

public class NumbersWithCommas {
        public static void main(String [] args){

        /*
        Write a program which contains a method called commaNumbers. This method takes one input to represent a number (an integer).
        The method should return a String to represent the same number with appropriate commas in place.

        Sample Input 1
            1000

        Sample Output 1
            1,000

        Sample Input 2
            100000

        Sample Output 2
            100,000

        Sample Input 3
            20

        Sample Output 3
            20 
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        sc.close();

        System.out.println();
        System.out.println(commaNumbers(input));
    }
    public static String commaNumbers(int inputString){
        DecimalFormat df = new DecimalFormat("#,###"); // Creates a pattern 
        return df.format(inputString);   
    }
}

