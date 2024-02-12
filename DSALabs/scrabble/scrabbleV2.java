import java.util.Scanner;

/* 
    Scrabble Points -> 
    1 point – A E I O U L N S T R
    2 points – D G
    3 points – B C M P
    4 points – F H V W Y
    5 points – K
    8 points – J X
    10 points – Q Z
*/

// Version 2
public class scrabbleV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int n = sc.nextInt(); // Input size of the array
        sc.nextLine(); // Move scanner to the next line

        String[] arr = new String[n]; // Create an array of strings

        System.out.println("Enter Strings: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine(); // Fill the array with user-input strings
        }

        bubbleSortScrabble(arr); // Sort the array of strings based on Scrabble scores

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]); // Print the sorted array of strings
        }
        sc.close();
    }

    // Method to calculate the Scrabble score of a word
    public static int scrabbleScore(String word) {
        int score = 0;

        for (char letter : word.toCharArray()) {
            // Assign scores based on each letter of the word
            switch (Character.toUpperCase(letter)) {
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'S', 'T', 'R':
                    score += 1;
                    break;

                case 'D', 'G':
                    score += 2;
                    break;
                case 'B', 'C', 'M', 'P':
                    score += 3;
                    break;
                case 'F', 'H', 'V', 'W', 'Y':
                    score += 4;
                    break;
                case 'K':
                    score += 5;
                    break;
                case 'J', 'X':
                    score += 8;
                    break;
                case 'Q', 'Z':
                    score += 10;
                    break;
            }
        }
        return score; // Return the total score of the word
    }

    // Method to perform bubble sort based on Scrabble scores
    public static void bubbleSortScrabble(String[] unsorted) {
        int n = unsorted.length;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 0; i < n - 1; i++) {
                int score1 = scrabbleScore(unsorted[i]);
                int score2 = scrabbleScore(unsorted[i + 1]);

                // Compare scores and word order, swap if necessary
                if (score1 > score2 || (score1 == score2 && unsorted[i].compareTo(unsorted[i + 1]) > 0)) {
                    String temp = unsorted[i];
                    unsorted[i] = unsorted[i + 1];
                    unsorted[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped); // Continue until no more swaps are needed
    }
}
