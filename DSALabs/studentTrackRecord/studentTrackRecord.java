package studentTrackRecord;
import java.util.Scanner;

public class studentTrackRecord {
    public static Scanner sc = new Scanner(System.in);

    /**
     * This method checks if a student passes or fails based on their attendance record
     * This method is not recursive
     * Uses a for loop to iterate through the input string
     * 
     */

    public static void main(String[] args) {
        System.out.println("Enter Student Record: ");
        
        String input = sc.nextLine().toUpperCase();

        System.out.println(passCheck(input));
        sc.close();
    }

    public static String passCheck(String input) {
        int absent = 0;             // Counter for consecutive absences
        int consecutiveLate = 0;    // Counter for consecutive late arrivals

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {

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
        }

        // If no conditions for failure are met, return "Pass"
        return "Pass";
    }
}
