package WarmUp;

public class UpandDown {
    public static void main(String [] args){
        /* 
        Write a Java program that prints all of the numbers from 1 to 10 to the screen a while and for loop
         and prints the numbers from 10 to 1 using a for and while loop
        */
        int num1 = 1;
        int num2 = 10;

        System.out.println("Using While loop");
        while(num1 <= 10){
            System.out.print(" " + num1);
            num1++;
        }

        System.out.println();

        while(num2 >= 1){
            System.out.print(" " + num2);
            num2--;
        }

        System.out.println();
        System.out.println();

        System.out.println("Using For Loop");

        for(int num3 = 1; num3 <= 10; num3++){
            System.out.print(" " + num3);
        }

        System.out.println();

        for(int num4 = 10; num4 >= 1; num4--){
            System.out.print(" " + num4);
        }
    }
}
