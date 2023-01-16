import java.util.Scanner;

public class Capital {
    public static void main(String [] args) {

        /* 
        Write a Java program that takes as user input a String and ensures that it only contains lowercase letters. 
        The program should then capitalise the first letter of each word in the String. 
        For example, the string “my name is aisling” should be printed as follows: “My Name Is Aisling” The String should be given as user input. 
        */

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        
        sc.close();
        
        System.out.println();

        String [] words = input.split(" "); // Splitting the string into words 

        for(int i = 0; i < words.length; i++){ 
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1); // Making the first letter capital and getting the rest of the word 
        }
        
        input = String.join(" ", words); // Joining the words togteher 

        System.out.println(input);
    }
}
