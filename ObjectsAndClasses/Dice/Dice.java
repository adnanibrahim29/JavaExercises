import java.util.Random;

public class Dice {
    private int numOfSides;
    private int faceValue;
    private Random random;

    // default constructor
    public Dice() {
        this.numOfSides = 6;
        this.random = new Random();
        rollDice(); // set random face value
    }

    // general constructor
    public Dice(int numOfSides, int faceValue) {
        this.numOfSides = numOfSides;
        this.faceValue = faceValue;
        this.random = new Random();
    }

    public int rollDice() {
        this.faceValue = random.nextInt(numOfSides) + 1;
        return this.faceValue;
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    public void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
