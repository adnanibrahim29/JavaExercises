package WarmUp;

public class TollBridge {
    public static void main(String [] args){
        
        /* 
        Write a java program that uses if selection statements to print o
        ut the cost of a toll based on the type of vehicle. Declare a character variable called vehicle. 
        Your program should check the value of the character variable vehicle to see if it represents a car, a 
        motorbike, a bus, a truck or a van. Depending on the type of vehicle it should print out 
        the appropriate toll price.
        */

        /* 
        The prices are as follows:
            Car - 2.00
            Motorbike - 1.10
            Bus - 4.25
            Truck - 6.70
            Van - 4.00 
        */


        char letter = 'c';


        if(letter == 'c'){
            System.out.println("Car - 2.00");
        }else if(letter == 'm'){
            System.out.println("Motorbike - 1.10");
        } else if(letter == 'b'){
            System.out.println("Bus - 4.25");
        } else if(letter == 't'){
            System.out.println("Truck - 6.70");
        } else if(letter == 'v'){
            System.out.println("Van - 4.00");
        } else{
            System.out.println("Not Valid");
        }


    }
    
}
