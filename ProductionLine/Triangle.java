import java.util.Scanner;

public class Triangle {
    public static void main(String [] args) {

        /* 
        Write a Java program that takes 3 doubles from the user. The program should then decide 
        if these are the sides of a triangle and what type of triangle is is. The doubles should be given as user input. 

        For a triangle to exist, (sideA + sideB) > sideC must hold for all three sides. A triangle is equilateral if all three
        sides are the same length, isosceles if two sides are the same length or scalene if all three sides are different. 
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side A: ");
        double sideA = sc.nextDouble();


        System.out.println();
        System.out.println("Enter side B");
        double sideB = sc.nextDouble();

        System.out.println();
        System.out.println("Enter side C");
        double sideC = sc.nextDouble();

        sc.close();

        System.out.println();

        if(sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA){
            if(sideA == sideB && sideB == sideC){
                System.out.println("This is a equilateral triangle");
            } 
            else if(sideA == sideB || sideB == sideC || sideA == sideC){
                System.out.println("This is a isosceles triangle");
            }
            else{
                System.out.println("This is a scalene triangle");
            }
        }
        else{
            System.out.println("This is not a triangle");
        }
    }
}
