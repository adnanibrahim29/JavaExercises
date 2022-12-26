package WarmUp;

public class Compare {
    public static void main(String [] args){
        /* 
        Write a Java program that compares two Strings. You have to declare a String s1 and assign it the value "programming" 
        and then declare another String s2 and assign it the value "development". Make sure that you declare each String on a line 
        of its own.

        Your program should do the following:

        1. If the two Strings are exactly the same print to the screen "Exactly the same: True" otherwise print 
        "Exactly the same: False". You may use boolean variables.
        2. If and only if the first comparison was false, a comparison should be done that ignores case sensitivity. 
        If they are the same while ignoring the case print to the screen "Similar: True" otherwise print "Similar: False". 
        */

        String s1 = "programming";
        String s2 = "devlopment";

        boolean SameSame = true;
        boolean NotSame = false;

        if(s1 == s2){
            System.out.println("Exactly the same: " +SameSame);
        } else{
        System.out.println("Exactly the same: " + NotSame);
       }

       if(NotSame){
        System.out.println("Similar: " + s1.equalsIgnoreCase(s2));
       } else{
        System.out.println("Similar: " + s1.equalsIgnoreCase(s2));
       }


    }
}
