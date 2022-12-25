package WarmUp;

public class BreakNums {
    public static void main(String [] args){
        /* 
        Write a Java program that determines and prints the digits that make up every three-digit number 
        that is divisible by 47. For example, for the digit 141 the program should print:

        141
        1
        4
        1
        **********
        */

        int num = 100;

        while(num <= 999){
            if(num % 47 == 0){
                System.out.println(num);
                System.out.println(num / 10 / 10);
                System.out.println(num / 10 % 10);
                System.out.println(num % 10);
                System.out.println("**********");
            }
            num++;
        }

    }
}
