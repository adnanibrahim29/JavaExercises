package WarmUp;

public class SummingUp {
    public static void main(String [] args){
        /*
        Write a Java program that uses for loops to compute:

        The sum of all numbers divisible by 13 between 1 and 100 (inclusive).
        The sum of all numbers squared between 1 and 100 (inclusive).
        */
        
        int sum= 0;
        int squared = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 13 == 0){
                sum+= i;
            }
            squared += i * i;
        }
        System.out.println("The sum of numbers divisible by 13 is " + sum);
        System.out.println();
        System.out.println("The sum of all squares is " + squared);

    }   
}
