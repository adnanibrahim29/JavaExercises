import java.util.Scanner;
import java.util.Arrays;

public class UniqueSort {
    public static void main(String [] args){

        /* 
        Write a Java method called uniqueSort which, given an array of integers:

        Removes all duplicate numbers
        Sorts the array from smallest to largest
        Returns the new array
        You should then print your final array in the main method.

        NOTE: The first input value is the "size" of your array. All remaining inputs are values in your array

        Sample Input 1
            4 1 2 4 3

        Sample Output 1
            1 2 3 4

        Sample Input 2
            9 1 4 4 4 4 3 2 1 2

        Sample Output 2
            1 2 3 4

        Sample Input 3
            7 6 7 6 4 3 2 1

        Sample Output 3
            1 2 3 6 7 
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size of Array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("Enter Numbers in the Array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println();

        int [] result = uniqueSort(arr);
        int [] output = removing(result);

        for(int i = 0; i < output.length; i++){
            System.out.print(output[i] + " ");
        }
    }
  
    public static int [] uniqueSort(int [] arr){

        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }return arr;

    }
    public static int [] removing(int [] arr){
        return Arrays.stream(arr).distinct().toArray();
    }  
}