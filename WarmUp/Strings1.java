package WarmUp;

public class Strings1 {
    public static void main(String [] args){

        /* Write a Java program that will:

        1. Create a String that references “Computer Science”.
        2. Create a String that references “Education”.
        3. Use your knowledge of generating substrings to take “Science” from the first string and store it in a new String.
        4. Use your knowledge of String concatenation to form a String “Science Education” from the newly created string and the second string.
        5. Print the concatenated String to the screen.
        */

        String s1 = "Computer Science";
        String s2 = "Education";

        String Extracted = s1.substring(9);

        System.out.println(Extracted + " " + s2);
    }
    
}
