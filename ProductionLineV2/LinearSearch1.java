import java.util.Scanner;

public class LinearSearch1 {
    public static void main(String [] args){
        /* 
        Write a Java program, called LinearSearch1 that contains a static method called findElement() that accepts a double array and a double as its
        parameters and return a boolean value if the double number entered is contained in the double array. In the main method you should use user input to 
        take the element you wish to search for in the array. There is code there for your array, DO NOT CHANGE THIS CODE. Your program should call findElement() to check 
        for the occurence of the double number entered in the array. You should print an appropriate message to the screen if the element is found.

        Output
            A message stating if the element is found.

        Sample Input 1
            678.954

        Sample Array 1
            345.6 678.954 234.534 -89.23 

        Sample Output 1
            678.954 was found in the array

        Sample Input 2
            65.45

        Sample Array 2
            345.6 678.954 234.534 -89.23

        Sample Output 2
            65.45 was NOT found in the array
        */

        //DO NOT CHANGE THE ARRAY DECLARATION
        
        Scanner sc = new Scanner(System.in);
        double [] num = {254.98,3.43,43321.54};
        System.out.println("Enter a number: ");
        double input = sc.nextDouble();
        sc.close();

        boolean found = findElement(num, input);
        if(found){
            System.out.println(input + " was found");
       }else{
            System.out.println(input + " was NOT found in the array");
       }
    }
    public static boolean findElement(double [] num, double input){
        for(int i = 0; i < num.length; i++){
            if(num[i] == input){
                return true;
            }
        }return false;
    }
}
