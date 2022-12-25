package WarmUp;

public class Sigma {
    public static void main(String [] args){
        /* 
        Write a Java program that uses a while loop to find the sigma of a number num. num should be an integer variable.
        Sigma (Σ denotes Sigma) is defined as the result of adding a sequence of natural numbers to each other, 
        from a given number down to 1. 
        */
        
        int num1 = 7;
        int sigma = 0;
        int counter = num1; // counter

       // using while loop
        while(counter >= 1){
            sigma = sigma + counter; // add number to sigma
            counter--;
        }
        System.out.println("The sigma of " + num1 + " is " + sigma);

        // using for loop
        System.out.println();
        
        int num2 = 4;
        int total = 0;

        for(int count = num2; count > 0; count--){
            total += count;
        }
        System.out.println("The sigma of " + num2 + " is " + total);
    }
    
}
