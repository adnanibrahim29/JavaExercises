import java.util.Scanner;

public class Vowels {
    public static void main(String [] args){

        /* 
        Write a method that returns the number of vowels in a string recusively. 
        You should call your method vowelCount

        Sample Input 1
        apple

        Sample Output 1
        2

        Sample Input 2
        Computer science

        Sample Output 2
        6 
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        sc.close();

        System.out.println();
        System.out.println(vowelCount(input));
    }
    public static int vowelCount(String input){
        if(input.length() == 0){
            return 0;
        }
        if(input.substring(0,1).matches("[AEIOUaeiou]")){
            return 1 + vowelCount(input.substring(1));
        }else{
            return vowelCount(input.substring(1));
        }
    }
    
}
