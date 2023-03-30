import java.util.Scanner;

public class BinarySearchGame {
    public static void main(String [] args){

        /* 
        In this Binary Search Guessing Game, The computer must check for the presence of an integer number in a provided range from start 
        to end (inclusive). At the end of the game, the number is revealed along with the number of tries it took the computer to get the 
        correct number. You should take the number being searched for from user input. The computer should use the binary search algorithm 
        to solve this question.

        NOTE: You are provided a range in which the number will be contained. DO NOT CHANGE THE PROVIDED start and end VARIABLES.

        Input
            n, where n is the number you will search for in the integer range provided.

        Sample Input
            7

        Output
            The number being searched for and the number of tries to find it

        Sample Output
            The number is: 7
            It took 4 tries! 
        */
        
        
        //DO NOT CHANGE THE start AND end VARIABLES
        int start = 1;
        int end = 10;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target Number: ");
        int target = sc.nextInt();

        int low = start;
        int high = end;

        int middle = 0;
        int count = 1;

        int [] arr = new int[end];

        for(int i = start; i < end; i++){
            arr[i] = i;
        }
        sc.close();

        boolean found = false;

        System.out.println();
        
        while(low <= high && !found){
            middle = (high + low) / 2;
            if(arr[middle] > target){
                high = middle -1;
                count++;
            }else if(arr[middle] < target){
                low = middle + 1;
                count++;
            }else{
                System.out.println("The number is: " + target);
                System.out.println("It took " + count + " tries!");
                found = true;
            }
        }
    }
}
