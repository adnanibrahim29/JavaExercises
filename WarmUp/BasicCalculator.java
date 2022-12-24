package WarmUp;

public class BasicCalculator {
    public static void main(String [] args){

        /*
         Write a program that initialises two variables to store whole numbers and a variable to 
        store a single character. This character should be either 
        '+', '-', '/' or '*'. The program should check the character and perform the appropriate arithmetic.
         That is, if the character is '+' then the result of the two numbers added together should be printed to the screen. 
         */

         char mathOpp = '*';
         int num1 = 9;
         int num2 = 3;
         

         if(mathOpp == '+'){
            System.out.println("Addition: " + (num1 + num2));
         } else if(mathOpp == '-'){
            System.out.println("Subtraction: " + (num1 - num2));
         } else if(mathOpp == '/'){
            System.out.println("Division: " + (num1 / num2));
         } else if(mathOpp == '*'){
            System.out.println("Multiply:" + (num1 * num2));
         }
    }
    
}
