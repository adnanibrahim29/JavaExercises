import java.util.Scanner;

public class LinearSearch2 {
    public static void main(String [] args){
        /* 
        Write a Java program, called LinearSearch2, that contains a static method called countStrings() that accepts a 2D array of Strings 
        and a String as its parameters. The method should return an integer value that is the total number of times the String being searched for
        is contained in the 2D String array. In the main method you should use user input to take the element you wish to search for in the 
        array. There is code there for your array, DO NOT CHANGE THIS CODE. You should print an appropriate message to the screen if the element is 
        found and how many times it exists in the array.

        Note: The countStrings() method should work irrespective of case.

        Sample Input 1
            Duck

        Sample Array 1
            cat dog dUck
            rabbit hen duCk
            dUcK DucK goose

        Sample Output 1
            Duck is contained 4 times in the array

        Sample Input 2
            Opel

        Sample Array 2
            Volvo Fiat Suzuki Toyota
            fiat Suzuki Volvo Ferrari
            Ferrari Porsche Lamborghini Jag
            Jag Fiat Citroen Toyota

        Sample Output 2
            Opel was NOT found in the array
        */
        
        //DO NOT CHANGE THE ARRAY DECLARATION
        String [][] words= {{"cat", "dog", "dUck"}, {"rabbit", "hen", "duCk"}, {"dUcK", "DucK", "goose"}};
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = sc.nextLine();
        sc.close();

        System.out.println();

        int count = countStrings(words, input);
        if(count > 0){
            System.out.println(input + " is contained " + count + " times in the array");
        }else{
            System.out.println(input + " is NOT found in the array");
        }
    }
    public static int countStrings(String [][]words, String input){
        int count = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(words[i][j].equalsIgnoreCase(input)){
                    count++;
                }
            }
        }return count;
    }
}
