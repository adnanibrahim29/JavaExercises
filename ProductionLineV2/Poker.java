import java.util.Scanner;

public class Poker {
    public static void main(String [] args){

        /* 
        In Poker, a "full house" occurs when your five cards contain three of one card and two of another. 
        For example: "K", "K", "5", "K", "5" would be a full house as there are 3 Kings and two 5's.

        Create a method that determines if a "hand" of 5 cards (which you can take in in your main method, stored in an array) is a
        full house. This method should be called fullHouseCheck. It will take an array as input and will return nothing. If it is a full
        house, you should print which card is the 3 of a kind, and which card is the two of a kind. Otherwise you should print 
        "Not a full house".

        Sample Input 1
            A
            A
            A
            K
            K

        Sample Output 1
            3 of a kind: A
            2 of a kind: K

        Sample Input 2
            3
            J
            3
            J
            3

        Sample Output 2
            3 of a kind: 3
            2 of a kind: J

        Sample Input 3
            10
            J
            10
            10
            10

        Sample Output 3
            Not a full house 
        */


        Scanner sc = new Scanner(System.in);
        String[] hand = new String[5];
        System.out.println("Enter the five cards in your hand:");
        for (int i = 0; i < 5; i++) {
            hand[i] = sc.next();
        }
        sc.close();

        fullHouseCheck(hand);
    }

    public static void fullHouseCheck(String[] hand) {
        String threeOfAKind = null;
        String twoOfAKind = null;
        for (int i = 0; i < hand.length; i++) {
            int count = 1;
            for (int j = i + 1; j < hand.length; j++) {
                if (hand[i].equals(hand[j])) {
                    count++;
                }
            }
            if (count == 3) {
                threeOfAKind = hand[i];
            } else if (count == 2) {
                twoOfAKind = hand[i];
            }
        }
        if (threeOfAKind != null && twoOfAKind != null) {
            System.out.println("3 of a kind: " + threeOfAKind);
            System.out.println("2 of a kind: " + twoOfAKind);
        } else {
            System.out.println("Not a full house");
        }
    }
}

