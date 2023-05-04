import java.util.Scanner;

public class CountDigits {
    public static void main(String [] args){

        /* 
        Given a user inputted non-negative integer write a recursive method (no loops) to count the number of occurrences of 8 as a digit,
        except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. You should call your method countEights. 
        Your method should take an integer as its parameter and return an integer that is the result of counting the eights.

        For Example:

        countEights(8) -> 1
        countEights(8818) -> 4
        countEights(888) -> 5

        Input
            n, where n is an integer value

        Sample Input
            8818

        Output
            8's in n

        Sample Output
            Result = 4 
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        sc.close();

        System.out.println();
        System.out.println("Result = " + countEights(input));
    }
    public static int countEights(int input){
        if(input < 8){
            return 0;
        }
        if(input % 10 == 8){
            if(input / 10 % 10 == 8){
                return 2 + countEights(input / 10);
            }return 1 + countEights(input/ 10);
        }return countEights(input / 10);
    }
}
