import java.text.DecimalFormat;
import java.util.Scanner;

public class euroMillionsJackpot {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Jackpot Amount");
        int jackpot = sc.nextInt();
        double cost = 2.50; // average cost of a ticket

        DecimalFormat f = new DecimalFormat("#,000");

        double expectedReturn = getExpectedReturn(jackpot, cost);
        double ticketValue = getTicketValue(expectedReturn, cost);
        System.out.println("Ticket Value: " + f.format(ticketValue));
    }

    public static double getExpectedReturn(int jackpot, double cost) {
        int trials = 10000;

        System.out.println("Enter the amount you want to invest: ");
        double investedAmount = sc.nextDouble() - cost; // Subtract the cost of the ticket

        double totalReturn = 0;
        for (int i = 0; i < trials; i++) {
            double randomReturn = Math.random() * jackpot + 1; // Simulate random return and get random double between 0.0 and 1.0
            if (randomReturn == jackpot) { // If the random return is equal to the jackpot
                investedAmount = jackpot; // Set the invested amount to the jackpot
                jackpot += investedAmount; // Add the prize to the jackpot
            }
            else {
                totalReturn += randomReturn; // Add to total return each time we simulate a round
            }
        }

        double averageReturn = totalReturn / trials; // Calculate average return
        return investedAmount * averageReturn * 100 / jackpot; // Return as a percentage of the jackpot

    }
    
    public static double getTicketValue(double expectedReturn, double cost) {
        return expectedReturn * cost;
    }
}
