import java.util.Scanner;

public class ValidName {
    public static void main(String [] args){
        
        /* 
        Write a Java program that requests a user to input their first name. The program should verify that the user enters a reasonable first name.
        A reasonable first name should begin with a capital letter. It should be between 2 and 25 characters in length. 
        It shouldn't contain any special characters.

        This program should use the .matches(<...>) method with a regular expression. If the user does not enter a valid name, your program 
        should continually request that they enter a valid name until a valid name is entered.

        NOTE: Your output should exactly match the expected output.

        Sample Run of Program 1
            Michael              //user input  
            Name is valid        //output based on value of name

        Sample Run of Program 2
            aideen               //user input  
            Name is NOT valid    //output based on value of name

            Aid33n               //user input  
            Name is NOT valid    //output based on value of name

            Aideen               //user input  
            Name is valid        //output based on value of name 
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String input = sc.nextLine();
        sc.close();

        boolean valid = false;

        while(valid == false){
            if(NameCheck(input) == true){
                valid = true;
                System.out.println();
                System.out.println("Name is Valid");
            }else{
                System.out.println();
                System.out.println("Name is NOT Valid");
                break;
            }
        }
    }
    public static boolean NameCheck(String input){
        boolean check = input.matches("^[A-Z][a-z]{1,24}$");
        return check;
    }
}
