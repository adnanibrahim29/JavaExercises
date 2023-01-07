import java.util.Scanner;

public class TripleChar {
    public static void main(String [] args){
        /* 
        Write a java program that takes a String as user input and then prints the string again with every character repeated 3 times. 
        */
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        
        sc.close();

        String res = "";

        System.out.println();

        for(int i = 0; i < word.length(); i++){ // Looping through the word

            char letters = word.charAt(i); // Getting the i pos of the word
            res = res + letters + letters + letters; // Storing the i pos and adding it 3 times into the result
        }
        System.out.println(res);
    }
}
