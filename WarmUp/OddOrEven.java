package WarmUp;

public class OddOrEven {
    public static void main(String [] args){
        
       /*
        Write a Java program that determines if a number is even or odd.
        Your program should have a variable to store an integer number and print the appropriate message.
       */ 
      int num = 202;

      if(num % 2 == 0){
        System.out.println(num + " is even");
      } else{
        System.out.println(num + " is odd");
      }
    }
    
}
