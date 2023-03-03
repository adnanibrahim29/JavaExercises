import java.util.Scanner;

public class Palindromes {
    public static void main(String [] args){
        /* 
        In a java program, write a method called isPalindrome() that accepts a String parameter and returns a Boolean. 
        This method should check if the String is a Palindrome and return an appropriate boolean value. 
        Your method should work irrespective of case. In the main method, you should call the method with 
        a user inputted String being passed into isPalindrome(). 
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = sc.nextLine();
        sc.close();
        
        isPalindrome(input);

    }
    public static void isPalindrome(String input){
        String rev = "";

        for(int i = input.length()-1; i >= 0; i--){
            rev += input.charAt(i);
        }
        if(input.equalsIgnoreCase(rev)){
            System.out.println(input.toUpperCase() + " is a Palindrome");
        }else{
            System.out.println(input.toUpperCase() + " is NOT a Palindrome");
        }
    }   
}
