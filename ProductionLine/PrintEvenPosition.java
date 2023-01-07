import java.util.Scanner;

public class PrintEvenPosition {
    public static void main(String [] args){
        /* 
        Write a java program that takes a String as user input. The program should then print out the characters at even positions in the string.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        sc.close();

        System.out.println();
        
        for(int i = 0; i < word.length(); i+=2){
            System.out.print(word.charAt(i));
        }
    }
}
