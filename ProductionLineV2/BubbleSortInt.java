import java.util.Scanner;

public class BubbleSortInt {
    public static void main(String [] args){

        /* 
        Given an array of Integers, use Bubble sort to sort the array by the number of digits in the Integer (from largest to smallest). 
        If there are two Integers with the same number of digits, sort the Integers by value from smallest to largest. 
        The array will be provided by user input with the first number being how many Integers there are in the array.

        Sample Array 1
            5 78 987 2 7632 12398

        Sample Output 1
            12398 7632 987 78 2

        Sample Array 2
            6 77 23 5 1 7 101

        Sample Output 2
            101 23 77 1 5 7 
        */
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array: ");
        int len = sc.nextInt();
        int [] arr = new int[len];

        System.out.println();
        System.out.println("Enter a Elements in Array");
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){

                // Converting to String
                String[] strArray = new String[arr.length];
                for (int k = 0; k < arr.length; k++) {
                    strArray[k] = String.valueOf(arr[k]);
                }

                if(strArray[j].length() == strArray[j+1].length()){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                else{
                    if(arr[j] < arr[j+1]){
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                }
            }
        System.out.println();
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}   

