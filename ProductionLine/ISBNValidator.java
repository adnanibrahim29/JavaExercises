import java.util.Scanner;

public class ISBNValidator {
    public static void main(String [] args) {

        /* 
        The International Standard Book Number (ISBN) is a unique identifier given to every published book. ISBNs published after January 2007 are 13 digits long (ISBN-13), 
        however books published before this date are 10 digits long (ISBN-10). 

        You are required to write a method which will take in a random String of characters and confirm if it is a valid ISBN number. 
        It is not guaranteed that each character of the string will be a digit.

        An ISBN10 number is verified this way:

        isbn10 = "0330301624"

        Line up the digits with the numbers from 10 to 1.
        0	3	3	0	3	0	1	6	2	4
        10	9	8	7	6	5	4	3	2	1


        Multiply each digit with the digit below it and sum up the products.
        0+ 27 + 24 + 0 + 18 + 0 + 4 + 18 + 4 + 4 = 99

        If the sum of divisible by 11 then it is a valid ISBN number.

        An ISBN13 number is verified this way:

        ISBN Number = "9780316066525"

        9	7	8	0	3	1	6	0	6	6	5	2	5
        1	3	1	3	1	3	1	3	1	3	1	3	1


        Multiply each digit with the digit below it and sum up the products.
        9 + 21 + 8 + 0 + 3 + 3 + 6 + 0 + 6 + 18 + 5 + 6 + 5 = 90

        If the number is divisible by 10 it is a valid ISBN number.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an ISBN number: ");
        String input = sc.nextLine();
        sc.close();
        int local = 0, temp;

        if(input.length() == 10){
            int [] ISBN10 = {10,9,8,7,6,5,4,3,2,1};
            for(int i = 0; i < input.length(); i++){
                temp = ISBN10[i] * input.charAt(i); // Multipliying each postions in the array by each postion in the string 
                local += temp; // getting the sum of each value 
            }
            if(local % 11 == 0){
                System.out.println("Valid ISBN-10");
            } else{
                System.out.println("Not Valid");
            }
        } else if(input.length() == 13){
            int [] ISBN13 = {1,3,1,3,1,3,1,3,1,3,1,3,1};
            for(int i = 0; i < input.length(); i++){
                temp = ISBN13[i] * input.charAt(i); // Multipliying each postions in the array by each postion in the string 
                local += temp; // getting the sum of each value 
            }
            if(local % 10 == 0){
                System.out.println("Valid ISBN-13");
            } else{
                System.out.println("Not Valid");
            }
        } else{
            System.out.println("ISBN Not Valid");
        }
    }
}
