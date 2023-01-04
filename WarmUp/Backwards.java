package WarmUp;

public class Backwards {
    public static void main(String [] args){
        /* 
        Write a Java program that takes a String, called sentence that references a lowercase String. The program should print the String in reverse word by word. 
        Your String should be assigned the value “pay no attention to that man behind the curtain” 
        and should be printed as the sample output below. 
        */

        String sentence = "pay no attention to that man behind the curtain";
        String words[] = sentence.split(" ");

        for(int i = words.length-1; i >= 0; i--){
            System.out.println(words[i]);
        }
    }
}
