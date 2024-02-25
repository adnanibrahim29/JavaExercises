import java.util.Scanner;

public class loanCalculator {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the loan amount: ");
        long loan = sc.nextLong();

        System.out.println("Enter Interest rate");
        double interest = sc.nextDouble();

        System.out.println("Enter Monthly payment");
        long payment = sc.nextLong();

        double months = leftToPay(loan, interest, payment);
        double years = months / 12;

        // Check if the loan has already been paid off
        if (loan <= 0) {
            System.out.println("Congratulations, you have paid off your loan!");
        } else {
            // Display the time required to pay off the remaining loan amount
            System.out.println("It will take " + months + " months " + (double) Math.round(years * 10) / 10 + " years to pay off the loan");
        }
    }

    // Recursive method to calculate the remaining loan amount
    public static double leftToPay(double loan, double interest, long payment) {
        // Base case: If the loan is already paid off
        if (loan <= 0) {
            return 0;
        }

        // Calculate monthly interest and the remaining loan amount after payment
        double monthlyInterest = interest / (12 * 100);
        double thisMonthInterest = loan * monthlyInterest;
        double loanAfterPayment = (loan + thisMonthInterest) - payment;

        // Recursively calculate the remaining loan amount for the next month
        return 1 + leftToPay(loanAfterPayment, interest, payment);
    }
}
