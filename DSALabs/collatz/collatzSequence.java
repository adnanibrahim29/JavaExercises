package collatz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * This is a first version of the program
 * In this collatz program I am using quick sort to sort the numbers by their collatz length.
 */
public class collatzSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a position: ");
        int n = sc.nextInt();

        List<Integer> sortedNumbers = sortNumbersByCollatzLength();
        System.out.println("The number at position " + n + " is: " + sortedNumbers.get(n - 1));
        sc.close();
    }

    public static List<Integer> sortNumbersByCollatzLength() {
        List<int[]> pairs = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            pairs.add(new int[]{i, collatzLength(i)});
        }

        // Quick sort
        quickSort(pairs, 0, pairs.size() - 1);

        List<Integer> sortedNumbers = new ArrayList<>();
        for (int[] pair : pairs) {
            sortedNumbers.add(pair[0]);
        }
        return sortedNumbers;
    }

    public static void quickSort(List<int[]> pairs, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(pairs, low, high);
            quickSort(pairs, low, pivotIndex - 1);
            quickSort(pairs, pivotIndex + 1, high);
        }
    }

    public static int partition(List<int[]> pairs, int low, int high) {
        int[] pivot = pairs.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (pairs.get(j)[1] < pivot[1]) {
                i++;
                swap(pairs, i, j);
            }
        }
        swap(pairs, i + 1, high);
        return i + 1;
    }

    /**
     * Swaps two elements in a list of integer arrays.
     *
     * @param pairs the list of integer arrays
     * @param i the index of the first element to swap
     * @param j the index of the second element to swap
     */
    public static void swap(List<int[]> pairs, int i, int j) {
        int[] temp = pairs.get(i);
        pairs.set(i, pairs.get(j));
        pairs.set(j, temp);
    }

    public static int collatzLength(int n) {
        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0) { // If n is even
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            steps++;
        }
        return steps;
    }
}
