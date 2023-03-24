import java.util.Scanner;

public class ValidAge {
    public static void main(String [] args){
        
        /* 
        Write a Java program that requests a user to input their age. The program should verify that the value the user enters is 
        considered valid, lying in the range between 0 and 150. This program should use the .matches(<...>) method with a regular expression. 
        If the user does not enter a valid age, your program should continually request that they enter a valid age until a valid age is entered.

        NOTE: Your output should exactly match the expected output.

        Sample Run of Program 1
            23                   //user input  
            Age is valid         //output based on value of age
        */

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter an Integer");
        int input = sc.nextInt();

        System.out.println();
        
        boolean valid = false;
        while(valid == false){
            if(input >= 0 && input <=150){
                valid = true;
                System.out.println("Age is Valid");
            }else{
                valid = true;
                System.out.println("Age is not Valid");
            }
        sc.close();
        }
    }
    public static boolean AgeCheck(int input){
        String result = Integer.toString(input);
        boolean check = result.matches("[0-9] | 1[0-9] | 2[0-9] | 3[0-9] | 4[0-9] | 5[0-9] | 6[0-9] | 7[0-9] | 8[0-9] | 9[0-9] | 10[0-9] | 11[0-9] | 12[0-9] | 13[0-9] | 14[0-9] | 15[0]");
        return check;   
    }
}
