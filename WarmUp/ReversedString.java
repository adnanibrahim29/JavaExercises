package WarmUp;

public class ReversedString {
    public static void main(String [] args){
        
        /* 
        Write a Java program that will take a String and reverse it. To complete this question 
        Declare a String called s1 and assign it the value "programming". 
        Your program should then reverse this string using a loop. 
        */

        String s1 = "programming";
        String s2 = "";

        for(int i = s1.length() -1; i >=0; i--){
            
            s2 += s1.charAt(i);
        }
        System.out.println("Reversed String: " + s2);
    }
}
