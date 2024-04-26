package collatz;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * This version of the collatz program uses parallel streams to sort the numbers by their Collatz length.
 */
public class collatz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a position: ");
        int n = sc.nextInt();

        if (n < 1 || n > 10000000) {
            System.out.println("Position out of range.");
        } else {
            List<Integer> sortedNumbers = sortNumbersByCollatzLength();
            System.out.println("The number at position " + n + " is: " + sortedNumbers.get(n - 1)); // n - 1 to get the 0-based index
        }
        sc.close();
    }

    public static List<Integer> sortNumbersByCollatzLength() {
        // Using parallel stream to speed up the sorting process
        return IntStream.rangeClosed(1, 10000000).parallel() // Generates numbers from 1 to 10,000,000
                .mapToObj(i -> new int[]{i, collatzLength(i)}) // Computes the length of the Collatz sequence for each number
                .sorted(Comparator.comparingInt(a -> a[1])) // Sorts the pairs by the Collatz length
                .map(pair -> pair[0]) // Extracts the number from the pair
                .collect(Collectors.toList()); // Collects the sorted numbers into a list
    }

    public static int collatzLength(int n) {
        int steps = 0;
        long current = n; // Use long to avoid overflow issues
        while (current != 1) {
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current = 3 * current + 1;
            }
            steps++;
        }
        return steps;
    }
}
