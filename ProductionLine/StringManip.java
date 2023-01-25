import java.util.Scanner;

public class StringManip {
    public static void main(String [] args) {

        /*
        Write a program that manipulates a String from user input.
        The program should:

        Prints each of the characters in the String on a separate line
        Prints each of the characters of the String in reverse
        Prints each of the words in the sentence one per line
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();

        sc.close();
        
        System.out.println();

        for(int i = 0; i < input.length(); i++){ // Looping through the string to print out each work line by line
            if(input.charAt(i) == ' '){

            }
            else{
                System.out.println(input.charAt(i));
            }
        }

        System.out.println();

        for(int i = input.length() -1; i >=0; i--){ // Looping through to print backwards
            System.out.print(input.charAt(i));
        }

        System.out.println();
        System.out.println();

        String[] words = input.split(" ");
        for(int i = 0; i < words.length; i++){ // Looping through the string to print out words on seperate lines 
            System.out.println(words[i]);
        }

    



        



    }
}
