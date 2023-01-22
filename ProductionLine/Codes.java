import java.util.Scanner;

public class Codes {
    public static void main(String [] args) {

        /* 
        Write a Java program that takes a module code from User Input. The program should continuously ask the user for input until the user enters "stop" or "STOP".
         Module codes consist of 2 letters followed by 3 digits. You should confirm this is a valid module code by converting the digits from a string to a number. 
        The program should take the letters and determine what department the module is from. It should then take the first number and determine which year of study the module is from.

        The following are valid departments

        CS->Computer Science
        EE->Electronic Engineering
        BI->Biology
        MT->Maths
        CH->Chemistry
        CI->Chinese
        BS->Business
        */

        Scanner sc = new Scanner(System.in);

        boolean checking = true;

        while(checking){
            System.out.println("Enter a module code or 'stop' to exit: ");
            String code = sc.nextLine().toUpperCase();

            String mod = code.substring(0,2); // Getting the first two 
            String numbers = code.substring(2,3); // Getting the year 
            int year = Integer.parseInt(numbers); // Converting the String into an integer 

            if(code.equals("stop") || code.equals("STOP")){ // is user types stop
                checking = false;
            }

            else if(mod.equals("CS") || mod.equals("cs")){
                System.out.println(code + " is a valid year " + year + " Computer Science module code");
            }
            else if(mod.equals("EE") || mod.equals("ee")){
                System.out.println(code + " is a valid year " + year + " Electronic Engineering module code");
            }
            else if(mod.equals("BI") || mod.equals("bi")){
                System.out.println(code + " is a valid year " + year + " Biology module code");
            }
            else if(mod.equals("MT") || mod.equals("mt")){
                System.out.println(code + " is a valid year " + year + " Maths module code");
            }
            else if(mod.equals("CH") || mod.equals("ch")){
                System.out.println(code + " is a valid year " + year + " Chemistry module code");
            }
            else if(mod.equals("CI") || mod.equals("ci")){
                System.out.println(code + " is a valid year " + year + " Chinese module code");
            }
            else if(mod.equals("BS") || mod.equals("bs")){
                System.out.println(code + " is a valid year " + year + " Business module code");
            }
            else{
                System.out.println(code + " is not valid");
            }
        }
        sc.close();
    }
}
