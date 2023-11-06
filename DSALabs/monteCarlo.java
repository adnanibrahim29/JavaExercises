//Lab 4 - Week 4

import java.util.Scanner;
import java.util.Random;

public class monteCarlo {

    // These can be accessed anywhere in fucntions
    public static Scanner sc = new Scanner(System.in); 
    public static Random rd = new Random();
    public static void main(String [] args){
        
        int input; // Initialise input variable
    
        do{
            menu(); // Calling menu
            input = sc.nextInt();

            switch(input){ // Switch between 1 2 or 3 
                case 1:
                    monteCarloE(); 
                    break;

                case 2:
                    monteCarloPi();
                    break;
                case 3: 
                    System.out.println("Goodbye");
                    System.exit(0);

                default:
                    System.out.println("Not a valid option");
                    System.out.println("Pick a Valid option");
                    System.out.println();
            }
        }while(input != 1 || input != 2 || input != 3); // if input number is not 1 2 or 3 then keep looping back until it is
        
    }

    public static void menu(){
        System.out.println();
        System.out.println("Enter 1 -> 'e' value");
        System.out.println("Enter 2 -> Pi Value");
        System.out.println("Enter 3 -> exit");
    }

    public static void monteCarloE(){
        // Monte Carlo method to estimate the value of e

        double total = 0;
       
        int N = 100000; // Number of iterations 
        
        for(int i = 0; i < N; i++){

            int sum = 0; 
            int count = 0; 

            while(sum <= 600){ // if the sum exceeds greater than 600
                sum += (int)(Math.random() * 600) + 1; // Generate a random value between 1 and 600 and add to the sum
                count++; // Increment the count of iterations
            }
            total = total + count; // Add the count of iterations to the total
        }
        double finalTotal = total/N; // Calculate the average number of iterations it took to exceed 600
        System.out.println();
        System.out.println("Monte Carlo e");
        System.out.println("Value of e: " + finalTotal);
        System.out.println("Absolute Error: " + Math.abs(finalTotal - 2.71828)); // Getting the absolute error value
    }

    public static void monteCarloPi(){
    // Monte Carlo method to estimate the valie of Pi

        int N = 100000; // Number of random points to generate
        int insideCircle = 0; // Counter for points inside the inscribed cricle

        for(int i = 0; i < N; i++){
            // Bringing the coordinates to [-1,1] (subtracting [0,2] to [-1,1])
            double x = Math.random() * 2 - 1; // Generating a random x value
            double y = Math.random() * 2 - 1; // Generating a random y value
            
            if(x * x + y * y <= 1){ // Checking if the (x,y) is inside the circle at radius 1
                insideCircle++; // Increment the count of points inside the circle
            }
        }
        double piVal = (4.0 * insideCircle) / N; // Getting the estimated value of pi using ratio of points
                                                 // inside the circle and dividing by the totalpoints
        System.out.println();
        System.out.println("Monte Carlo Pi");
        System.out.println("Value of Pi: " + piVal);
    }
}
