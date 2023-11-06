// Lab 2 - week 2

import java.util.Scanner;
public class cardCheck { 
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        String input = sc.nextLine();
        
        
        int sum = 0;
        String rev = "";

        while(input.length() < 4 || input.length() > 31){ // If the input is less 4 or greater than 31
            System.out.println("Invalid Enter again");
            input = sc.nextLine();
        }

        if(input.length() >= 4 && input.length() <= 30){
            // Revsersing the String 
            for(int i = 0; i < input.length(); i++){
                rev = input.charAt(i) + rev;
            }

            // Making String to char Array
            for(int i = 0; i < input.length(); i++){
                int num = Character.getNumericValue(rev.charAt(i)); // Making the position at i to get the integer value

                if(i % 2 == 1){ // If the position is a odd number
                    num *= 2; // Then double it

                    if(num > 9){   // If the number doubled is greater than 9
                        num -= 9;   // Then subtract 9 each time
                    }
                }
                sum += num; // Keep adding all the numbers
                
            }
        }
        if(sum % 10 == 0){
            System.out.println("VALID");
        }else{
            System.out.println("INVALID");
        }
        sc.close();
    }
}

