import java.util.Scanner;

public class Anagram {
    public static void main(String [] args){

        /* 
        Given two Strings, s1 and s2, write a Java program that determines if s2 is an anagram of s1 using Bubble sort. 
        If it is, print s1 in alphabetical order. If it is not, print s1 and s2 in alphabetical order.

        Sample Input 1
            anagram
            nagaram 

        Sample Output 1
            aaagmnr

        Sample Input 2
            cat
            mat

        Sample Output 2
            act
            amt 
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String [] s1 = sc.nextLine().split("");
        
        System.out.println();

        System.out.println("Enter a String: ");
        String [] s2 = sc.nextLine().split("");
        sc.close();
        
        String temp = "";

        for(int i = 0; i < s1.length; i++){
            for(int j = i + 1; j < s1.length; j++){
                if(s1[j].compareTo(s1[i]) < 0){
                    temp = s1[i];
                    s1[i] = s1[j];
                    s1[j] = temp;
                }
            }
        }
        String rev = "";
        for(int i = 0; i < s1.length; i++){
            rev = rev + s1[i];
        }

        String temp2 = "";
        for(int i = 0; i < s2.length; i++){
            for(int j = i + 1; j < s2.length; j++){
                if(s2[j].compareTo(s2[i]) < 0){
                    temp2 = s2[i];
                    s2[i] = s2[j];
                    s2[j] = temp2;
                }
            }
        }
        String rev2 = "";
        for(int i = 0; i < s2.length; i++){
            rev2 = rev2 + s2[i];
        }

        System.out.println();

        if(s2.equals(s1)){
            System.out.println(rev2);
        }else{
            System.out.println(rev);
            System.out.println(rev2);
        }
    }
}

