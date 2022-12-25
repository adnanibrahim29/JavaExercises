package WarmUp;

public class BedSong {
    public static void main(String [] args){
        /* 
        Write a Java program that uses a while loop to print out the following song:

        10 in a bed and the little one said,
        'Roll over, roll over'
        They all rolled over and one fell out,

        9 in a bed and the little one said,
        'Roll over, roll over'
        They all rolled over and one fell out,

        8 in a bed and the little one said,
        ...

        1 in a bed and the little one said,
        'Alone at last'
        */

        int count = 10;

        while(count > 1){ // looping from 10 -> 2
            System.out.println(count + " in a bed and the little one said");
            System.out.println("'Roll over, roll over'");
            System.out.println("They all rolled over and one fell out");
            System.out.println();
            
            count--;

            if(count == 1){
                System.out.println("1 in a bed and the little one said");
                System.out.println("'Alone at last'");
            }
        }
    }
}
