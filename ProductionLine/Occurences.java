import java.util.Scanner;

public class Occurences {
    public static void main(String [] args) {
        /* 
        Given an array of Strings, you must write Java code to take a String as input and then do the following:

        Count the number of times the String appears in the array in exactly the same case as the user inputted String.
        Count the number of times the String appears in the array where the case is different than the user inputted String.
        Note 1 of 2: The code for the array is given to you, please DO NOT CHANGE THIS

        Note 2 of 2: To pass the test cases the output must match the expected output exactly. (Please see sample output below.)
        
        Array Provided:
        {"smile", "sand", "SMILE", "SmIlE", "sand", "smile", "SmilE"}

        Sample Input:
        smile

        Sample Output:
        Same String: 2
        Similar String: 3
        */

        String [] words = {"smile", "sand", "SMILE", "SmIlE", "sand", "smile", "SmilE"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = sc.nextLine();

        sc.close();

        int similar = 0;
        int samesame = 0;

        for(int i = 0; i < words.length; i++){ // Looping through the array string 
            if(words[i].equals(input)){
                samesame++;
            } else if(words[i].equalsIgnoreCase(input)){
                similar++;
            } 
        }

        System.out.println();

        System.out.println("Same String: " + samesame);
        System.out.println("Similar String: " + similar);
    }
}
