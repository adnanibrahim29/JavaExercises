import java.util.Random;
import java.util.Scanner;

public class TheTraitorsSimulation {
    public static void main(String[] args) {
        // Initialize scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Define the number of simulations and initialize the counter for traitor wins
        int simulations = 10000;
        int traitorWins = 0;
        int totalParticipants = 22; // Total participants in the game

        // Prompt the user to enter the number of traitors
        System.out.println("Enter the number of traitors");
        int n = sc.nextInt(); // Read the number of traitors from user input

        while(!(n <= totalParticipants)){
            System.out.println("The number of traitors must be less than or equal to the total number of participants");
            System.out.println("Enter the number of traitors");
            n = sc.nextInt(); // If the entered number is not valid, ask again
        }
        // Run the simulation multiple times
        for(int i = 0; i < simulations; i++){
            // If traitors win the simulation, increment the traitorWins counter
            if(simulateGame(totalParticipants, n)){
                traitorWins++;
            }
        }

        // Calculate the probability of traitors winning
        double prob = (double) traitorWins / simulations;
        // Print the probability of traitors winning
        System.out.println("The probability of traitors winning is: " + (prob * 100) + "%");

        sc.close();
    }

    public static boolean simulateGame(int totalParticipants, int traitors){
        // Calculate the number of faithful participants
        int faithful = totalParticipants - traitors;
        // Initialize a Random object for generating random numbers
        Random rand = new Random();
        // Continue the simulation until only 2 participants are left
        while(totalParticipants > 2){
            // Each night, two eliminations happen: one vote-out and one murder
            
                // Generate a random double and compare it to the ratio of traitors to total participants
                //  simulates the chance of a traitor being randomly eliminated
                if (rand.nextDouble() < ((double) traitors / (totalParticipants * 2))) {
                    // A traitor is eliminated
                    traitors--;
                } else {
                    // A faithful is eliminated
                    faithful--;
                }
                // Decrease the total number of participants after each elimination
                totalParticipants--;
        }

        // Determine if traitors have won
        // Traitors win if there is at least one traitor among the final two participants
        int remainingTraitors = totalParticipants - faithful;
        return remainingTraitors > 0;
    }
}
