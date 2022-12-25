package WarmUp;

public class Primes {
    public static void main(String [] args){

        /*
        Write a Java program that uses a do-while loop to determine if a positive integer number (called num) is a prime number. 
        A number is prime if it is divisible only by 1 and itself. For example, 13 is prime but 
        12 is not (divisible by 1, 2, 3, 4, 6 and 12). 
        */

        int num = 13;
        int divCheck = 2; // From 2 and looping until num is divisible
        boolean isPrime = true;

        do{
            if(num % divCheck == 0){ // if number is divisible by the divCheck
                isPrime = false; // if number is not prime
                break; // breaking the loop
            }
            divCheck++; // moving to the next number
        }while(divCheck < num); // loop until divcheck is smaller than num
        
        // results
        if(isPrime){
            System.out.println(num + " is prime");
        } else{
            System.out.println(num + " is not prime");
        }
    }  
}
