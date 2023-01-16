import java.util.Scanner;

public class ReplaceA {
    public static void main(String [] args) {
        /* 
        Write a Java program that creates a String variable from user input and replaces every instance of a lowercase 'a' with '#' only if 'a' 
        appears 3 times or less. Otherwise replace 'a' with a '@'. You should then print this new String to the screen. 
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = sc.nextLine();

        sc.close();

        System.out.println();

        int count = input.length() - input.replace("a", "").length(); //Counting the number of a's in the string

        // Ternary perator -> true or false (if and else statements)                                                                 
        String output = count <= 3 ? input.replace("a", "#") : input.replace("a", "@"); // if count is less than 3 is true : if count is greater than 3

        System.out.println(output);

        
    }
}
