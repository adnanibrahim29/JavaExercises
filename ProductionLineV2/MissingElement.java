public class MissingElement {
    public static void main (String args[]){

        /* 
        Given an array of numbers, use Bubble sort to sort the array. The array contains a group of consecutive numbers, 
        however, one number is missing. Once the array is sorted, find and print the missing number. 
        You may assume all numbers are between the first sorted element and the last sorted element. 
        The code for the array is given to you, please DO NOT CHANGE THIS.

        Sample Arrays 1
        {1, 4, 7, 9, 3, 6, 8, 5}

        Sample Output 1
            2 
        */
        //DO NOT CHANGE THE ARRAY DECLARATION
        int missing[]={1, 4, 7, 9, 3, 6, 8, 5};

        int temp;
        for(int i = 0; i < missing.length; i++){
            for(int j = 0; j < missing.length - 1; j++){
                if(missing[j] > missing[j+1]){ // Swapping the biggest around
                    temp = missing[j];
                    missing[j] = missing[j+1];
                    missing[j+1] = temp;
                }
            }
        }

        System.out.println();
        
        int num = missing[0];
        for(int i = 0; i < missing.length; i++){
           if(missing[i] != num){
            System.out.println(num);
            break;
           }
           num++;
        }
    } 
}

