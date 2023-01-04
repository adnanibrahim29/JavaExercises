package WarmUp;
public class Palindromes {
    public static void main(String [] args){
        /* 
        Write a Java program that will determine if a String, called text, is a palindrome. 
        A String is a palindrome if the word remains the same when spelled in reverse. For example:

        NAVAN is a palindrome
        CAVAN is NOT a palindrome
        */

        String s1 = "NAVAN";
        String s2 = "";

        s1 = s1.toLowerCase();

        for(int i = s1.length()- 1; i >=0; i--){ // Loop to go backwards
            
            s2 += s1.charAt(i); // reversing the string 
        }
       
        if(s1.equals(s2)){
            System.out.println(s1.toUpperCase() + " is a palindrome");
        } else{
            System.out.println(s1.toUpperCase() + " is NOT a palindrome");
        }
    }
}
