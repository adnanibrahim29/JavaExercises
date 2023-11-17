import java.util.Scanner;

public class baseConverterV2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("Enter Inital Base "); // base 1
        int baseFrom = sc.nextInt();
        sc.nextLine();

        while(baseFrom < 2 || baseFrom > 32){ // While fromBase is less than 2 or greater than 32
            System.out.println("Invalid Base, Please enter a valid number between 2 and 32.");
            baseFrom = sc.nextInt();
        }

        System.out.println("Enter Target Base: ");
        int baseTo = sc.nextInt();
        sc.nextLine();

        while(baseTo < 2 || baseTo > 32){ // While tobase is less than 2 or greater than 32
            System.out.println("Invalid Base, Please enter a valid number between 2 and 32.");
            baseTo = sc.nextInt();
        }

        System.out.println("Enter number string");
        String numStr = sc.nextLine();
        
        int decimalVal = decimalConverter(numStr, baseFrom);
       
        String res = baseToConverter(numStr, baseTo, decimalVal);
        System.out.println(res);
    }

    public static int decimalConverter(String numStr, int baseFrom){
        int power = 0;
        int decVal = 0;
        for (int i = numStr.length() - 1; i >= 0; i--) {
            char digit = numStr.charAt(i);
            int digitValue;

            if (Character.isDigit(digit)) {
                digitValue = digit - '0';
            } else {
                digitValue = Character.toUpperCase(digit) - 'A' + 10; // Handle hexadecimal letters
            }
          
            decVal += digitValue * Math.pow(baseFrom, power);
            power++;
        }
        return decVal;
    }

    public static String baseToConverter(String numStr, int baseTo, int decimalVal) {
        String baseString = "";
        boolean isNegative = decimalVal < 0;
        decimalVal = Math.abs(decimalVal); // Work with the absolute value
    
        while (decimalVal > 0) {
            int remainder = decimalVal % baseTo;
            baseString = remainder + baseString;
    
            decimalVal = decimalVal / baseTo;
        }
    
        if (isNegative) {
            baseString = "-" + baseString;  // Add a '-' sign for negative numbers
            return baseString;
        }
        return baseString;
    }
}
