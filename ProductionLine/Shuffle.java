import java.util.Scanner;

public class Shuffle { 
    public static void main(String [] args) {

        /* 
        Write a Java program that takes all even-indexed characters and odd-indexed characters from a string, provided by user input, and concatenates them together.
        The new string should be printed to the screen.

        Sample Input 1
            0123456

        Sample Output 1
            0246135

        Sample Input 2
            abcd

        Sample Output 2
            acbd

        Sample Output 2 Explanation
            (a and c are even indexed, b and d are odd indexed
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        String even = "";
        String odd= "";

        for(int i = 0; i < input.length(); i++){
            if(i % 2 == 0){
                even += input.charAt(i);
            } else{
                odd += input.charAt(i);
            }
        }
        System.out.println();
        System.out.println("Output: " + even + odd);
    }   
}
