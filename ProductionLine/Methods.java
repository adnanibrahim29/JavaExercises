import java.util.Scanner;

public class Methods {
    public static void main(String [] args){
        /* 
        Write a Java program that accepts a word from the user. The program should:

        Print the word in uppercase
        Print the title case (capitalise the first letter)
        Print the length of the word
        Print each letter of the word on a seperate line 
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        sc.close();

        System.out.println();

        System.out.println(word.toUpperCase()); // All Upper case  

       System.out.println(word.toUpperCase().substring(0,1) + word.substring(1)); // Making the first letter capital 
        
       System.out.println("The length is: " + word.length()); // Length of the word 

       for(int i = 0; i < word.length(); i++){ // Looping through the word 
            char letter = word.charAt(i);
            System.out.println(letter);
       }


    }
}
