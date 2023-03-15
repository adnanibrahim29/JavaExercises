import java.util.Scanner;

public class VariousArrayTasks {
    public static void main(String [] args){
        /* 
        Write a Java program, called VariousArrayTasks that has 4 static methods called fillArray(), sumArray(), avgArray(), and printArray(). 
        
        The fillArray() method should use a Scanner to take in a number representing the length of the array and then read in numbers to fill the array. 
        This array will be an int array.

        The fillArray() method should take no input and return an int array. It should be called from the main method.

        The sumArray() method should take an int array as its input parameter and returns an integer value that is the sum of all the elements in the array.

        The avgArray() method should take an int array as its input parameter and return a double value that is the average of all the elements in the array.

        The printArray() method should take an int array as its input parameter and has no return value. It should then print out the elements of the array on the same 
        line separated by a space (“ “). All methods should work for integer arrays.

        Input
            n , where n is the length of the array, followed by n numbers

        Sample Input
            3 2 3 4

        Output
            The program should print to the screen the sum of all the elements in the 
            array, and the average of all the elements in the array followed by the array 
            elements printed to the screen separated by a space.

        Sample Output
            Sum = 9
            Average = 3.0
            2 3 4 

        Note: In the fillArray method you should close your Scanner when you are finished taking input. 
        In your code these should match EXACTLY to pass all test cases. 
        */
        int [] arr = fillArray();

        System.out.println("Sum = " + sumArray(arr));
        System.out.println("Average = " + avgArray(arr));
        printArray(arr);
    }
    public static int [] fillArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int len = sc.nextInt();
        
        int [] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static int sumArray(int [] arr){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }return sum;
    }
    public static double avgArray(int [] arr){
        int sum = sumArray(arr);
        double avg = sum / (double)arr.length;
        return avg;
    }
    public static void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
