public class Dog extends Animal {
    private int numDogBiscuitsEaten;
    
    public Dog() {
        super();
        numDogBiscuitsEaten = 0;
    }
    
    public Dog(String animalDiet, String animalSound) {
        super(animalDiet, animalSound);
        numDogBiscuitsEaten = 0;
    }
    
    public int getBiscuitsEaten() {
        return numDogBiscuitsEaten;
    }
    
    public void eatDogBiscuit() {
        numDogBiscuitsEaten++;
    }
}
