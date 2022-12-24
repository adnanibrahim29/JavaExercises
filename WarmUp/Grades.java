package WarmUp;

public class Grades {
    public static void main(String [] args){
        /*
          Write a Java program that uses a switch statement to give students feedback based on their grade. 
          Declare a character variable called grade and set it to the default 'F'. 
          The program should print the messages below based on the value of grade.

            'A' - "Excellent Grade"
            'B' - "Good Grade"
            'C' - "Average Grade"
            'D' - "Poor Grade"
            'E' & 'F' - "Fail"
            Any other character - "Not a valid grade"
        */


        char grade = 'A';

        switch(grade){
            case 'A': System.out.println("Excellent Grade"); break;
            case 'B': System.out.println("Good Grade"); break;
            case 'C': System.out.println("Average Grade"); break;
            case 'D': System.out.println("poor Grade"); break;
            case 'E': System.out.println("Fail");break;
            case 'F': System.out.println("Fail");break;
            default: System.out.println("Not a valid grade ");
        }
    }
}
