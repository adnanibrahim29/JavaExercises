package WarmUp;

public class Strings2 {
    public static void main(String [] args){
        /*
        Write a Java program that: Creates a String that refers to “Most guitars have six strings.” 
        Using relevant String methods:

        1. Print the length of the String on a new line.
        2. Print the position of the first occurrence of the character 'h' on a new line.
        3. Print to the screen the String in all lower case characters on a new line.
        4. Print to the screen the String in all upper case characters on a new line. 
        */

        String s1 = new String("Most guitars have six strings.");

        System.out.println("String Length " + s1.length());
        System.out.println("Position of first 'h': " + s1.indexOf("h"));
        System.out.println("All lowercase: " + s1.toLowerCase());
        System.out.println("All uppercase: " + s1.toUpperCase());

    }   

}
