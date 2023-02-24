import java.util.Scanner;

public class FiveOrMore {
    public static void main(String [] args) {

        /*  
        Write a Java program, called FiveOrMore that takes a String as user input. The program should then reverse every word in the String that has a length greater than five.

        Sample Input
            Just keep swimming

        Sample Output
            Just keep gnimmiws
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = sc.nextLine();

        String [] words = input.split(" ");
        String rev = "";
        
        for(int i = 0; i < words.length; i++){
            if(words[i].length() > 5){
                for(int j = words[i].length()-1; j >= 0; j--){
                    rev += words[i].charAt(j);
                }
                words[i] = rev;
            }
        }
        System.out.println();
        String output = String.join(" ", words);
        System.out.println(output);
    }
}
