import java.util.Scanner;

public class baseConverterV1 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("Enter Initial base");
        int fromBase = sc.nextInt();
        sc.nextLine(); // Throwaway line
        
        System.out.println();
        while(fromBase < 2 || fromBase > 32){ // While fromBase is less than 2 or greater than 32
            System.out.println("Invalid Base, Please enter a valid number between 2 and 32.");
            fromBase = sc.nextInt();
        }

        System.out.println("Enter Target base");
        int toBase = sc.nextInt();
        sc.nextLine(); // Throwaway line
        System.out.println();

        while(toBase < 2 || toBase > 32){ // While tobase is less than 2 or greater than 32
            System.out.println("Invalid Base, Please enter a valid number between 2 and 32.");
            toBase = sc.nextInt();
        }

        System.out.println("Number to Convert");
        String baseStr = sc.next();


        String resultString = convertFromBaseToBase(baseStr,fromBase,toBase);

        System.out.println(resultString.toUpperCase());
    }
    
    public static String convertFromBaseToBase(String baseStr, int fromBase, int toBase) {
        
        String result;
        try{
            // Converts into decimal value
            int decimalValue = Integer.parseInt(baseStr,fromBase);

            // Converts decimal value to the target base and returns as a string
            result = Integer.toString(decimalValue, toBase);
            
        }catch(NumberFormatException nfe){
            return "Error: Invalid input";
        }
        return result;
    }
}
