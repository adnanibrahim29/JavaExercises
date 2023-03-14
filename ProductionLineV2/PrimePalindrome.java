import java.util.Scanner;

public class PrimePalindrome {
    public static void main(String [] args){
        /* 
        Write a java program that takes in a number N and finds the smallest palindrome prime greater than or equal to N. 
        This should be done by creating two methods, one to check if the number is prime and one to check if the number is a palindrome. 
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        sc.close();

        System.out.println();
        for(int i = N; i < 2000; i++){
            if(isPrime(i) && isPalindrome(i) == true){
                System.out.println("The next palindrome prime number is " + i);
                break;
            }
        }
    }
    public static boolean isPrime(int N){
        int count = 0;
        int result = 0;

        if(N % 2 == 0 || N % 3 == 0 || N % 5 == 0 || N % 7 == 0){
            return false;
        } else{
            result = N;
            count++;
        }return true;
    }
    public static boolean isPalindrome(int N){
        String num = Integer.toString(N);
        String rev = "";

        for(int i = 0; i < num.length(); i++){
            rev = num.charAt(i) + rev;
        }

        if(rev.equals(num)){
            return true;
        }else{
            return false;
        }
    }
}
