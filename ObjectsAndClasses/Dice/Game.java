public class Game {
    public static void main(String[] args) {
        // create dice objects
        Dice dice1 = new Dice(); // using default constructor
        Dice dice2 = new Dice(8, 4); // using general constructor

        // use getter methods
        System.out.println("Number of sides of dice1: " + dice1.getNumOfSides());
        System.out.println("Current face value of dice2: " + dice2.getFaceValue());

        // use setter method
        dice1.setNumOfSides(10);
        System.out.println("Number of sides of dice1 after setting: " + dice1.getNumOfSides());

        // roll the dice and print face value
        int roll1 = dice1.rollDice();
        int roll2 = dice2.rollDice();
        System.out.println("dice1 rolled: " + roll1);
        System.out.println("dice2 rolled: " + roll2);
    }
}
