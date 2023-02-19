import java.util.Random;

public class Song {
    public static void main(String [] args) {
        
    /* 
    Write a Java program that uses a random number generated (in the range of 2 to 20, inclusive) and a while loop to print out the song shown below, 
    with the number of verses depending on the random number generated. In the sample output the random number 10 was used.

    Important Note: You must print your random number with the text "Random Number: x" where x is your Random Number please see the sample output for an example

    Sample Output
        Random Number: 10

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
        Random rd = new Random();
        int randNum = rd.nextInt(20) + 2; // Getting between 2 and 20 

        System.out.println("Random Number: " + randNum);
        System.out.println();
        while(randNum >= 1){
            if(randNum >=2) {
                System.out.println(randNum + " in a bed and the little one said,");
                System.out.println("'Roll over, roll over'");
                System.out.println("They all rolled over and one fell out");
                System.out.println();
                randNum--;
            } else{
                System.out.println(randNum + " in a bed and the little one said,");
                System.out.println("'Alone at last'");
                randNum--;
            }
        }
    }
}
