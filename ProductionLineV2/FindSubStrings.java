import java.util.Scanner;

public class FindSubStrings {
    public static void main(String [] args){

        /* 
        Given a String x, a substring m from x and a number n, write a recursive method (no loops) to check if at least n copies of the substring m appear in the String x. 
        You should call your method checkForSub. checkForSub should take in 2 Strings and an Integer value and return a Boolean.

        For Example:

        checkForSub("catcowcat", "cat", 2) -> true
        checkForSub("catcowcat", "cow", 2) -> false
        checkForSub("catcowcat", "cow", 1) -> true 
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String x = sc.nextLine();
        System.out.println();

        System.out.println("Enter Check String: ");
        String m = sc.nextLine();
        System.out.println();

        System.out.println("Enter how many times: ");
        int n = sc.nextInt();
        System.out.println();
        sc.close();

        boolean output = checkForSub(x, m, n);
       System.out.println(output);

    }
    public static boolean checkForSub(String x, String m, int n){

        if(n == 0){ // Base case 
            return true; // Found enough coppies of m

        }else if(x.length() < m.length()){ 
            return false; // can find amount of times in the substring in the string 

        }else if(x.substring(0, m.length()).equals(m)){ // Found a copy of the substring at the beginning of the string 
            // and recurse with the string minus the substring 
            return checkForSub(x.substring(m.length()), m, n-1);
        
        }else{ // Didnt find a copy of the substring at the beginnign of the string, recurse with the string 
            // string minus the first character
            return checkForSub(x.substring(1), m, n);
        }
    }
}
