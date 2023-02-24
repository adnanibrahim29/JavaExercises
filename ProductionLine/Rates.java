import java.util.Scanner;

public class Rates {
    public static void main(String [] args) {

        /* 
        Use your knowledge of Strings, arrays, user Input, casting and converting to write a Java program that:

        Casts user inputted Strings to doubles. These Strings represent the hourly rate of pay for employees.
        Store all the values in a double array (of size 5).
        From this double array print to the screen the largest rate of hourly pay and the lowest rate of hourly pay in the format shown in the sample output below.
        Note:
        You will need to input 5 Strings.
        All 5 inputted strings will be in the format:
        "11.57 is John’s rate of pay."

        Sample Input
            13.34 is Louise’s rate of pay
            12.11 is Harry’s rate of pay
            14.41 is Emmet’s rate of pay
            14.12 is Laura’s rate of pay
            12.34 is Mick’s rate of pay

        Sample Output
            Largest: 14.41
            Lowest: 12.11 
        */

        Scanner sc = new Scanner(System.in);

        double [] rates = new double[5];
        String [] employeeName = {"Louise", "Harry", "Emmet", "Laura", "Mick"};

        System.out.println();
        for(int i = 0; i < rates.length; i++){
            
            System.out.print(employeeName[i] + "'s rate of pay is ");
            rates[i] = sc.nextDouble();
        }
        sc.close();
        double Largest = rates[0];
        double Lowest = rates[0];

        for(int i = 0; i < rates.length; i++){
            if(rates[i] > Largest){
                Largest = rates[i];
            } else if(rates[i] < Lowest){
                Lowest = rates[i];
            }
        }

        // Finding the difference
        System.out.println();
        System.out.println("Largest: " + Largest);
        System.out.println("Lowest: " + Lowest);
    }
}
