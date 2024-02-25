package studentTrackRecord;
import java.util.Scanner;

public class studentTrackRecordRecursive {

    /**
     * This program checks if a student passes or fails based on their attendance record
     * This is the recursive method to check the attendance record
     * 
     */
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student Record: ");
        String input = sc.nextLine().toUpperCase();
        
        // Display the result of passCheck method
        System.out.println(passCheck(input));

        sc.close();
    }

    // method for passCheck with initial parameters
    public static String passCheck(String input) {
        return passCheck(input, 0, 0, 0);
    }

    // Recursive method to check if a student passes or fails based on attendance record
    public static String passCheck(String input, int i, int absent, int consecutiveLate) {
        // Base case: If the end of the string is reached. 
        if (i == input.length()) {
            return "Pass";
        }

        char current = input.charAt(i);

        // Check for absence (A)
        if (current == 'A') {
            absent++;

            // If two or more consecutive absences
            if (absent >= 2) {
                return "Fail";
            }
        }

        // Check for late arrival
        if (current == 'L') {
            consecutiveLate++;

            // If three or more consecutive late arrivals
            if (consecutiveLate >= 3) {
                return "Fail";
            }
        } else {
            // Reset consecutive late counter if the current day is not late
            consecutiveLate = 0;
        }

        // Recursively call passCheck for the next character in the input string
        return passCheck(input, i + 1, absent, consecutiveLate);
    }
}
