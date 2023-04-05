import java.util.Scanner;

public class TestBasicCircle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Radius: ");
        int input1 = sc.nextInt(); 
        System.out.println("Enter a Radius: ");
        int input2 = sc.nextInt();
        System.out.println("Enter a Radius: ");
        int input3 = sc.nextInt();


        BasicCircle Circle = new BasicCircle();

        System.out.println("Circle 1 has a radius of " + Circle.getRadius(input1));
        System.out.println("Circle 2 has a radius of " + Circle.getRadius(input2));
        System.out.println("Circle 3 has a radius of " + Circle.getRadius(input3));

        System.out.println("Circle 1 has a circumference of " + Circle.getCircumference(input1));
        System.out.println("Circle 2 has a circumference of " + Circle.getCircumference(input2));
        System.out.println("Circle 3 has a circumference of " + Circle.getCircumference(input3));

        System.out.println("Circle 1 has an area of " + Circle.getArea(input1));
        System.out.println("Circle 2 has an area of " + Circle.getArea(input2));
        System.out.println("Circle 3 has an area of " + Circle.getArea(input3));
        
        sc.close();
        

    }
}