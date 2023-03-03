import java.util.Scanner;

public class CleanString {
    public static void main(String [] args){

        /*
        Given a user inputted String write a recursive method (no loops) to "clean" the String. 
        A "cleaned" String is one where only adjacent characters that are the same have been reduced to a single char. So "yyzzza" yields "yza". 
        You should call your method cleanString.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        sc.close();

        System.out.println();
        System.out.println(cleanString(input));

    }
    public static String cleanString(String input){
        if(input.length() <= 1){
            return input;
        }if(input.substring(1,2).equals(input.substring(0,1))){
            return cleanString(input.substring(1));
        }else{
            return input.substring(0, 1) + cleanString(input.substring(1));
        }
    }
}
