import java.util.Scanner;

public class stringMerge {

    public static Scanner sc = new Scanner(System.in);

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Choose merging strategy:");
        System.out.println("1. Alphabetical Merge");
        System.out.println("2. Simple Combine Merge");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.println();
        while(choice != 1 && choice != 2){
            System.out.println("Invalid choice. Please enter 1 or 2.");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
        }

        System.out.println();
        System.out.println("Enter the first string:");
        String first = sc.nextLine();

        System.out.println("Enter the second string:");
        String second = sc.nextLine();

        System.out.println();
        switch (choice) {
            case 1:
                alphabetMerge(first, second);
                break;
            case 2:
                combineMerge(first, second);
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                break;
        }

        sc.close();
    }

    /**
     * 
     * @param first
     * @param second
     * 
     * Reversing the Strings 
     */

    public static void alphabetMerge(String first, String second) { // Merging string alphabetically
        String merged = mergeStrings(first, second);
        char[] charArray = merged.toCharArray();

        // Manual sort in descending order
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (Character.compare(charArray[i], charArray[j]) > 0) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }

        // Reverse the string
        String finalString = "";
        for (int i = 0; i < charArray.length; i++) {
            finalString = charArray[i] + finalString;
        }

        System.out.println("The merged string is: ");
        for (int i = 0; i < finalString.length(); i++) {
            System.out.print(finalString.charAt(i) + " ");
        }
    }

    /**
     * 
     * @param first
     * @param second
     */
    public static void combineMerge(String first, String second) { // Combine the strings and print them out as they are
        char[] merged = mergeStrings(first, second).toCharArray();
        System.out.println("The merged string is: ");
        for (char output : merged) {
            System.out.print(output + " ");
        }
    }

    /**
     * 
     * @param first
     * @param second
     * @return Merged String
     */
    public static String mergeStrings(String first, String second) { // Using Recursion to merge the strings
        if (first.length() == 0) {
            return second;
        }
        if (second.length() == 0) {
            return first;
        }
        return first.charAt(0) + "" + second.charAt(0) + mergeStrings(first.substring(1), second.substring(1));
    }
}
