import java.util.Scanner;

public class AsciiDifference {
    public static void main(String [] args) {

        /* 
        Write a Java program, called AsciiDifference that accepts two Strings as user input and then print the difference 
        in the sum of ASCII values of the two Strings as an integer value.

        Sample Input
            ireland
            IRELAND

        Sample Output
            224

        Explanation
        String s1 = "ireland"; String s2 = "IRELAND"; The sum of ASCII Values for s1 = 735 The sum of ASCII Values for 
        s2 = 511 The difference between s1 and s2 = 224
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the first string: ");
        String str2 = sc.nextLine();

        sc.close();

        int asciisum1 = 0;
        int asciisum2 = 0;

        for(int i = 0; i < str1.length(); i++){
            asciisum1 += (int) str1.charAt(i);
        }
        for(int i = 0; i < str2.length(); i++){
            asciisum2 += (int) str2.charAt(i);
        }
        // Finding the difference
        if(asciisum1 > asciisum2){
            int diff1 = asciisum1 - asciisum2;
            System.out.println(diff1);
        }else{
            int diff2 = asciisum2 - asciisum1;
            System.out.println(diff2);
        }
    }
}
