import java.util.Scanner;

public class StringReverse {
    public static void main(String [] args ){

        /* 
        Write a recursive method (no loops) which takes a String and reverses it. You should call this method reverseString. 
        The method should take a String and return the String reversed. 
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        System.out.println(reverseString(input));
    }
    public static String reverseString(String input){
        if(input.length() == 0){
            return input;
        } else{
            char first = input.charAt(0);
            String rev = reverseString(input.substring(1));
            return rev + first;
        }
    }
}
