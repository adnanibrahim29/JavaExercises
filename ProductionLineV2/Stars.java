import java.util.Scanner;

public class Stars {
    public static void main(String [] args){
        /*
        In a class, write a method called printStarTriangle() that accepts an integer parameter and returns nothing.
        This method should print to the screen rows of asterisk characters that form the shape of a triangle. The amount of rows is based on the value of the integer parameter. 
        The first row should start with one * and increment by one * for each row there after.

        For example, if the parameter held the value 3 the method would print:

            *
            **
            ***
        In the main method you should call the method with a user inputted integer being passed into printStarTriangle(). 
        */
        printStarTriangle();

    }
    public static void printStarTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int input = sc.nextInt();
        sc.close();

        System.out.println();
        for(int i = 1; i <= input; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
