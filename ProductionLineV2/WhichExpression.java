import java.util.Scanner;

public class WhichExpression {
    public static void main(String [] args){

        /*
        Write a method that takes a String as a parameter and prints to the screen which of the regular expressions shown below is satisfied by 
        the String. The String can only contain the characters a and b and you must use the .matches(<...>) method with a regular expression.
        The method doesn't have to return anything.

        Regular Expression No.	Regular Expression
        1:	a(b|a)b
        2:	(ab)*b
        3:	a(b|a)*
        4:	((a|b)a)*

        If the String satisfies more than one regular expression print it on a new line. See output. If the String does not satisfy any 
        expression have a valid print statement in your main method call the method with user input.

        Sample Input 1
            abb

        Sample Output 1
            1
            2
            3

        Sample Input 2
            ababad

        Sample Output 2
            Not in the language 
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        sc.close();

        System.out.println();
        RegEx(input);
    }
    public static void RegEx(String input){

        if(input.matches("a(b|a)b")){
            System.out.println("1");
    
           }if(input.matches("(ab)*b")){
            System.out.println("2");
    
           }if(input.matches("a(b|a)*")){
            System.out.println("3");
    
           }if(input.matches("((a|b)a)*")){
            System.out.println("4");
    
           }if(!input.matches("a(b|a)b |(ab)*b |(a(b|a)*)|((a|b)a)*")) {
            System.out.println("Not in the language");
        }
    }
}
