import java.util.Scanner;

public class AddingLetters { 
    public static void main(String [] args) {

        /* 
        Write a Java method that takes in a string and returns a new string with each of the characters accumulating by 1. 
        Each set of characters should be separated by a dash. The first letter of each set should be a capital. 
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        String updated = "";
        sc.close();

        int len = 0;

        System.out.println();
        for(int i = 0; i < word.length(); i++){
            updated = word.substring(i, i + 1).toUpperCase(); // Making the 
            System.out.print(updated); // The first letter of each char is capital

            len = i; // Making the len equal the position at i

            while(len > 0){ // While the postion at i is greater than 0
                System.out.print(updated.toLowerCase());
                len--; // getting it to 0
            }
            if(word.length() - i == 1 ){ // If the word length minus the postion is 1 
                continue;
            } else{ // If it is not then print with the dash
                System.out.print("-");
            }   
        }
    }
}
