package WarmUp;

public class HowMany {
    public static void main(String [] args){
        /*
        Write a Java program that uses a while-loop to check how many times an integer num1 can be divided by 2 
        before the number becomes less than 2.
        The program should then print to the screen the number of times num1 can be successively divided by 2.
        */

        int num1 = 30;
        int count = 0;

        while(num1 > 1){
            num1 = num1 / 2;
            count++;
        }

        System.out.println(count);
    }
    
}
