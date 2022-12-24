package WarmUp;

// Testing out with String and Variables
// Starting out basic programs
 
public class WarmingUp {
    public static void main(String [] args){
        System.out.println();

        System.out.println("Welcome to Warming up:");

        System.out.println();

        // Warming up printing
        System.out.println("Strings warm up:");
        System.out.println();

        System.out.println("3 + 4");
        System.out.println(3 + 4);
        System.out.println( 3 + "4");

        System.out.println();

        // Warming up variable
        System.out.println("Variables warm up:");
        System.out.println();

        int num1 = 5;
        double num2 = 2.3;
        char letter = 's';

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(letter);

        System.out.println();

        // Warming up operations
        System.out.println("Operations Warm up:");
        System.out.println();

        int num3 = 10, num4 = 5, result1 = 0, result2 = 0;
        double result3 = 0.0;

        result1 = num3 + num4;
        result2 = num3 * num4;
        result3 = num3 / num4;

        System.out.println("Addition: " + result1);
        System.out.println("Multiplication: " + result2);
        System.out.println("Division: " + result3);

        System.out.println();

        // Warming up combination 
        System.out.println("Combination Warm up:");
        System.out.println();

        int num5 = 123;

        System.out.println("The digits in the number " + num5 + " are: ");
        System.out.println(num5/100);
        System.out.println(num5%100/10);
        System.out.println(num5%10);

    }
}
