public class WellOrdered {
    public static void main(String [] args) {

        /* 
        Write a Java program that determines and prints all well-ordered three-digit numbers.
        A number is well-ordered if its digits increase from left to right. For example 123 is well ordered, 837 is not well ordered.
        */


        for(int i = 100; i <= 999; i++){ // Looping through 100 till 999
            int right = i % 10;
            int middle = (i / 10) % 10;
            int left = i / 100;

            if(left < middle && middle < right){
               System.out.println(i);
            }
        }
    }
}
