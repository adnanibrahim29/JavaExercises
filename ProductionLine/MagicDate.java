import java.util.Scanner;

public class MagicDate {
    public static void main(String [] args) {

        /* 
        Write a Java program that checks if a date is magic. The date will be entered as dd/mm/yyyy. 
        For a date to be magic, one of the following conditions must be met.

        if dd*mm is a single digit, it must equal the last digit of the year.
        if dd*mm is two digits, it must equal the last two digits of the year.
        if dd*mm is three digits, it must equal the last three digits of the year.
        
        Sample Input 1
            2/2/1954
        
        Sample Output 1
            Magic
        
        Explanation 1
            2 * 2 = 4
        
        Sample Input 2
            3/11/2002
        
        Sample Output 2
            Not Magic
        
        Explanation 2
            3 * 11 != 02 
        */

        Scanner sc = new Scanner(System.in);
;
        System.out.println("Enter a date in the format dd/mm/yyyy:");
        String input = sc.nextLine();
        sc.close();

        String [] dateParts = input.split("/");

        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);
        int magicNumber;

        magicNumber = day * month;

        if(Integer.toString(magicNumber).length() == 1){
            if(magicNumber == year % 10){
                System.out.println("Magic");
            } else{
                System.out.println("Not Magic");
            }
        }
        if(Integer.toString(magicNumber).length() == 2){
            if(magicNumber == year % 100){
                System.out.println("Magic");
            } else{
                System.out.println("Not Magic");
            }
        }
        if(Integer.toString(magicNumber).length() == 3){
            if(magicNumber == year % 1000){
                System.out.println("Magic");
            } else{
                System.out.println("Not Magic");
            }
        }
    }   
}
