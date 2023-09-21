public class GeneralTester {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger("omnivore", "purr");
        Horse horse = new Horse("herbivore", "neigh", 40);
        
        dog.printDetails();
        System.out.println();
        
        dog.setAnimalSound("woof");
        dog.eatDogBiscuit();
        dog.printDetails();
        System.out.println("Biscuits Eaten: " + dog.getBiscuitsEaten());
        System.out.println();
        
        horse.printDetails();
        System.out.println();
        
        horse.setSpeed(48);
        System.out.println("New Speed: " + horse.getSpeed());
        System.out.println();
        
        tiger.setAnimalDiet("carnivore");
        tiger.printDetails();
    }
}
