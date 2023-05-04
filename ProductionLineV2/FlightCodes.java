import java.util.Scanner;

public class FlightCodes {
    public static void main(String [] args){

        /* 
        Write a Java program that requests a user to enter a flight code. The program should verify that the user enters a valid flight code.
        A valid flight code begins with 2 or 3 capital letters and is followed by 3 or 4 digits.

        This program should use the .matches(<...>) method with a regular expression. If the user does not enter a valid code, your program 
        should continually request that they enter a valid flight code until a valid code is entered.

        NOTE: Your output should exactly match the expected output.

        Sample Run of Program 1
            EI320                      //user input  
            Flight code is valid       //output based on value of code

        Sample Run of Program 2
            rea4121                    //user input  
            Flight code is NOT valid   //output based on value of code
            REA4121                    //user input  
            Flight code is valid       //output based on value of code 
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Flight Code: ");
        String input = sc.nextLine();
        sc.close();

        boolean valid = false;

        while(valid == false){
            if(input.matches("[A-Z]{2,3}[0-9]{3,4}")){
                valid = true;
                System.out.println();
                System.out.println(input);
                System.out.println("Flight Code is Valid");
                break;
            }else{
                System.out.println();
                System.out.println(input);
                System.out.println("Flight Code is NOT Valid");
                break;
            }
        }
    }
}
