import java.util.Scanner;

public class LongestShortest {
    public static void main(String [] args) {

        /* 
        Write a java program to find the longest and shortest String in an array of Strings. You must then print both of these values and their positions in the array out to the screen.
        You should then print the position of every String within the array along with the value on a new line out to the screen. (please see sample output for example). 
        The array's size will be decided by user input and then filled with Strings given by user input.

        Note 1 of 2: When using User Input to take in an integer for this question, please use Integer.parseInt(sc.nextLine()) Please see example usage below.
            Scanner sc = new Scanner(System.in);
            int num = Integer.parseInt(sc.nextLine());

        Note 2 of 2: To pass the test cases the output must match the expected output exactly. (Please see sample output below.)
        
        Sample Input: 
        5
        canvas
        class
        substantial
        tedious
        cat

        Sample Output:
        Longest String: substantial
        Longest position: 2
        Shortest String: cat
        Shortest position: 4
        0 canvas
        1 class
        2 substantial
        3 tedious
        4 cat
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int num = Integer.parseInt(sc.nextLine());

        String [] words = new String[num];
        
        for(int i = 0; i < words.length; i++){
            System.out.println("Enter a word: ");
            words[i] = sc.nextLine();
        }
        sc.close();

        System.out.println();

        int longestPos = 0;
        int shortestPos = 0;

        for(int i = 0; i < words.length; i++){ // Looping through the string array
            if(words[i].length() > words[longestPos].length()){ // Finding the biggest
                longestPos = i;
            } else if(words[i].length() < words[shortestPos].length()){ // Finding the shortest
                shortestPos = i;
            }
        }

        System.out.println("Longest String: " + words[longestPos]);
        System.out.println("Longest Position: " + longestPos);
        System.out.println("Shortest String: " + words[shortestPos]);
        System.out.println("Short Postion: " + shortestPos);

        for(int i = 0; i < words.length; i++){
            System.out.println(i + " " + words[i]);
        }
    }
}