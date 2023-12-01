import java.util.*;


public class scrabbleV1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        
        System.out.println("Enter number of words you want to Enter: ");
        int n = sc.nextInt();
        sc.nextLine();

        List <String> words = new ArrayList <String>(); // Creates an array list of strings

        for(int i = 0; i < n; i++){
            String word = sc.nextLine();
            words.add(word); // Adding words to the list
        }

        // Sorting the words list                          // new Comparator creates a new instance of an anonymous class 
        Collections.sort(words, new Comparator<String>() { // Created a new interface from the comparator

            public int compare(String word1, String word2){ // This is the of the compare method from the Comparator interface. 
                int score1 = totalScore(word1); // Calling back the total score function to get the score of the word
                int score2 = totalScore(word2); // Calling back the total score function to get the score of the word

                if(score1 == score2){ // If scores are equal
                    return word1.compareTo(word2); // Sort alphabetically
                }
                return Integer.compare(score1,score2); // Sort by score
            }
        });

        System.out.println("\nOutput: "); // Printing out the results
        for(String word : words){
            System.out.println(word);
        }
    }

    public static int totalScore(String word){ // Getting the total scores based of what they represent
        int score = 0;

        // Using toCharArray to make each word into a charArray
        for(char letter : word.toCharArray()){ // Using a loop to loop through the words
            switch (Character.toUpperCase(letter)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'L':
                case 'N':
                case 'S':
                case 'T':
                case 'R':
                    score += 1;
                    break;
                case 'D':
                case 'G':
                    score += 2;
                    break;
                case 'B':
                case 'C':
                case 'M':
                case 'P':
                    score += 3;
                    break;
                case 'F':
                case 'H':
                case 'V':
                case 'W':
                case 'Y':
                    score += 4;
                    break;
                case 'K':
                    score += 5;
                    break;
                case 'J':
                case 'X':
                    score += 8;
                    break;
                case 'Q':
                case 'Z':
                    score += 10;
                    break;
            }   
        }
        return score; // Returns total score
    }
}
