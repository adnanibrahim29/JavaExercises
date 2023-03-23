import java.util.Scanner;

public class AsciiDifference {
    public static void main(String [] args){

        /* 
        Write a Java program, called AsciiDifference that contains a static method called difference() that accepts two Strings as the input
        parameters and returns the difference in the sum of ASCII values of the two Strings as an integer value. The input parameters should be read in 
        from the user in the main method and passed to the difference() method. The main method should print returned integer to the screen.

        Sample Input
            ireland
            IRELAND

        Sample Output
            224

        Explanation
        String s1 = "ireland"; String s2 = "IRELAND"; The sum of ASCII Values for s1 = 735 The sum of ASCII Values for s2 = 511 The 
        difference between s1 and s2 = 224 
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String input1 = sc.nextLine();

        System.out.println();

        System.out.println("Enter Second String: ");
        String input2 = sc.nextLine();
        sc.close();

        System.out.println();
        System.out.println(difference(input1, input2));
    }
    public static int difference(String input1, String input2){
        int ascii1 = 0;
        int ascii2 = 0;

        for(int i = 0; i < input1.length(); i++){
            ascii1 += (int) input1.charAt(i);
        }
        for(int i = 0; i < input2.length(); i++){
            ascii2 += (int) input2.charAt(i);
        }

        if(ascii1 < ascii2){
            return ascii2 - ascii1;
        }else{
            return ascii1 - ascii2;
        }
    }
}
