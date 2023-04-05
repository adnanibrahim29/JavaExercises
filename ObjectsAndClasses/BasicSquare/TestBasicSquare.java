import java.util.Scanner;

public class TestBasicSquare{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Length: ");
        int input1 = sc.nextInt();
        System.out.println("Enter a Length: ");
        int input2 = sc.nextInt();
        System.out.println("Enter a Length: ");
        int input3 = sc.nextInt();


        BasicSquare Square = new BasicSquare();
        int x = input1;
        int y = input2;
        int z = input3;

        System.out.println("Square 1 has a side of length " + x);
        System.out.println("Square 2 has a side of length " + y);
        System.out.println("Square 3 has a side of length " + z);

        System.out.println("Square 1 has a perimeter of " + Square.getPerimeter(input1));
        System.out.println("Square 2 has a perimeter of " + Square.getPerimeter(input2));
        System.out.println("Square 3 has a perimeter of " + Square.getPerimeter(input3));

        System.out.println("Square 1 has an area of " + Square.getArea(input1));
        System.out.println("Square 2 has an area of " + Square.getArea(input2));
        System.out.println("Square 3 has an area of " + Square.getArea(input3));
        
        sc.close();
        
        Square.getLen();
        Square.setLen(5);
    }
}