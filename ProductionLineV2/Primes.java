import java.util.Scanner;

public class Primes {
    public static void main(String [] args){

        /* 
        Write a java program called Primes. This program should contain a method called isPrime() that accepts an integer parameter and returns a boolean value. 
        This method should check if the integer is a prime number or not and return an appropriate boolean value. 
        The main method should call the isPrime() 
        method and print an appropriate messge to the screen. 
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        sc.close();
        
        System.out.println(input + " -> " + isPrime(input));
    }
    public static boolean isPrime(int input){
        boolean isPrime = true;
        int divcheck = 2;

        do{
            if(input % divcheck == 0){
                isPrime = false;
                break;
            }
            divcheck++;
        }while(divcheck < input);

        if(isPrime){
            return true;
        }else{
            return false;
        }
    }
}
