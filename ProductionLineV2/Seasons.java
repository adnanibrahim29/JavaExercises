import java.util.Scanner;

public class Seasons{
    public static void main(String [] args){
        /*  Write a Java program, called Seasons, which contains a static method called printSeason() which takes no input parameters and returns nothing. 
        The printSeason() method should get the user to input a single integer value between 1 and 12 representing a month of the year and print a message saying what Season it is. 
        (see table below for Months and Seasons). To test the printSeason() method you should call it from the main method.

        Month	Number Representation	Season
        January	        1	            Winter
        February	    2	            Winter
        March	        3	            Spring
        April	        4	            Spring
        May	            5	            Spring
        June	        6	            Summer
        July	        7	            Summer
        August	        8	            Summer
        September	    9	            Autumn
        October	        10	            Autumn
        November	    11	            Autumn
        December	    12	            Winter
        
        Sample Input
            4
        Sample Output
            April is in Spring
        */
        printSeason();
    }
    public static void printSeason(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12:");
        int checkNum = sc.nextInt();
        sc.close();
        System.out.println();
        
        switch(checkNum){
            case 1: System.out.println("January is in Winter"); break;
            case 2: System.out.println("Febuary is in Winter"); break;
            case 3: System.out.println("March is in Spring"); break;
            case 4: System.out.println("April is in Spring"); break;
            case 5: System.out.println("May is in Spring"); break;
            case 6: System.out.println("June is in Summer"); break;
            case 7: System.out.println("July is in Summer"); break;
            case 8: System.out.println("August is in Summer"); break;
            case 9: System.out.println("September is in Autumn"); break;
            case 10: System.out.println("October is in Autumn"); break;
            case 11: System.out.println("November is in Autumn"); break;
            case 12: System.out.println("December is in Winter"); break;
            default: System.out.println("Invalid number");
        } 
    }
}