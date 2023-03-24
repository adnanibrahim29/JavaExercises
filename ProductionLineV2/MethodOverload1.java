import java.util.Scanner;

public class MethodOverload1 {
    public static void main(String [] args){
        /* 
        Write a Java program, called MethodOverload that contains 5 static methods called area(). Each of these methods will 
        calculate the area of a user inputted shape; they will take in different parameters as below. They should all return a double and 
        calculate the area of the corresponding shape (formulas given):

        1. area(int) -> Area of a Square = len^2. len is the length of a side.
        2. area(int, int) -> Area of a Rectangle = w*h. w is the width of a side and h is the height.
        3. area(double, int) -> Area of an Triangle = (1/2)*b*h. b is the base and h is the height.
        4. area(double) -> Area of a Circle = pi*r^2. r is the radius of the circle.
        5. area(double, double) -> Area of an Ellipse = pi*a*b. a is (1/2) the length of the major axis and b is (1/2) the length of the 
        minor axis. The major and minor axis will be given in the question. 

        The main method should take in user input to determine what shape the area needs to be calculated for. Depending on the shape given the program should then take in the correct parameters from the user (see Example below). Each input will be given in the order given in the descriptions above. You should also have an output if a non valid shape was entered. use "Not a valid shape!" as this message.

        NOTE: you can use Math.PI to get the value of pi in Java, and Math.pow(x,y) can be used for x to the power of y.

        Example

        "Square 4" would determine that you are required to find the area of a square with a side length of 4.

        "Rectangle 4 4" would determine that you are required to find the area of a rectangle with width and height 4.

        Input
        n
        x

        where n is a String representing the shape, x is the number to go with the shape.
        
        Sample Input
            Square
            4
        Output
            The area of a square with side of length 4

        Sample Output
            Area: 16.0
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a shape");
        String shape = sc.nextLine();

        switch(shape){
            case "square":
                System.out.println("Enter Length: ");
                int a = sc.nextInt();
                System.out.println(area(a)); break;

            case "rectangle":
                System.out.println("Enter Size: ");
                int b = sc.nextInt();
                int c = sc.nextInt();
                System.out.println(area(b,c)); break;

            case "triangle":
                System.out.println("Enter Size: ");
                double d = sc.nextDouble();
                int e = sc.nextInt();
                System.out.println(area(d, e)); break;
            
            case "circle":
                System.out.println("Enter Size: ");
                double f = sc.nextDouble();
                System.out.println(area(f)); break;
            
            case "ellipse":
                System.out.println("Enter size");
                double g = sc.nextDouble();
                double h = sc.nextDouble();
                System.out.println(area(g, h)); break;

            default: System.out.println("Invalid Shape!");
            sc.close();
        }
    }
    public static double area(int a){
        return (double) Math.pow(a,2);
    }
    public static double area(int b, int c){
        return (double) b * c;
    }
    public static double area(double d, int e){
        return (double) 0.5 * d * e;
    }
    public static double area(double f){
        return (double) Math.PI * Math.pow(f, 2);
    }
    public static double area(double g, double h){
        return (double) Math.PI * 0.5 * g * 0.5 * h;
    }
}
