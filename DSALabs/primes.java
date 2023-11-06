// Lab 1 - week 1

import java.util.Scanner;

public class primes {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println();

        int choice = 0; // Initaialising the choice option 

        while(choice != -1){ // Making sure the choice is not -1, (use to kill the program)
            menu();
            if(sc.hasNextInt()){ // If the Scanner has a integer and giving choice
                choice = sc.nextInt();
                if(choice == 1){
                    boolean isPrime = true;
                    int divcheck = 2; // Something to check if the number can be divided (Lowest Number Possible)

                    System.out.println("Enter a number");
                    int input = sc.nextInt();
                    
                    do{   // Checking if a number is a prime number
                        if(input % divcheck == 0){ // Checking if the input number has a remainder 
                            isPrime = false; // if it does even is not a prime number
                            break; // Kills the code
                        }
                        divcheck++; // If the number is big then incrementing the dividing test number by 1 
                    }while(divcheck < input); // Doing all this while the input number is smaller that the test number
                    
                    if(isPrime){
                        System.out.println(input + " is Prime");
                    }else{
                        System.out.println(input + " is not Prime");
                    }
                    System.out.println();

                }else if(choice == 2){
                    System.out.println("Enter start of range: ");
                    int range1 = sc.nextInt();
                    System.out.println("Enter end of range");
                    int range2 = sc.nextInt();
                    
                    System.out.print("Prime numbers in the range [" + range1 + "," + range2 + "]: ");
                    for(int n = range1; n <= range2; n++){ // Between the range 
                    
                        if(range(n)){ // If there is any prime numbers in that range then print it out
                            System.out.print(n + " ");
                        }
                    }
                    System.out.println();
                }else{
                    System.out.println();
                    System.out.println("Invalid Options Try again!");
                }
                System.out.println();
            
            }else{
                String exit = sc.next();
                if(exit.equalsIgnoreCase("x")){
                    System.out.println("GoodBye!");
                    choice = -1;
                }else{
                    System.out.println();
                    System.out.println("Try Again!");
                }
            }
        }
        sc.close();
    }

    public static boolean range(int num){ // Method to print find the prime number in a range
        for(int i = 2; i <= num/i; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void menu(){
        System.out.println("Enter Option 1 or 2 or 'x' ");
        System.out.println("1 -> Check Prime");
        System.out.println("2 -> Prime Range");
        System.out.println("'x' to exit program");

    }
}
