package WarmUp;

public class Fees {
    public static void main(String [] args){

        /*
          Write a Java program that prints out the fee to use a golf course depending on
          whether the user is a member or not. 
          If the user is a member the fee is 5 and if not the fee is 20.
        */

         // use the ternary operator 

         char member = 'Y';

         int fee = (member == 'Y') ? 5:20;
         System.out.println("The fee is: " + fee);
         

    }
    
}
