public class TestDog {
    public static void main(String[] args) {
        // declare 3 Dog objects
        Dog dog1 = new Dog("Lady", "Poodle", 2, false);
        Dog dog2 = new Dog("Rocky", "Pit Bull", 4, true);
        Dog dog3 = new Dog(); // default constructor

        // set attributes for dog3 using setter methods
        dog3.setName("Spot");
        dog3.setBreed("Dalmatian");
        dog3.setAge(3);
        dog3.setDangerous(false);

        // print information for dog3 using getter methods
        System.out.println("Dog 3 is called " + dog3.getName());
        System.out.println("It is a " + dog3.getBreed());
        System.out.println("They are " + dog3.getAge() + " years old");
        System.out.println("Their Licence Number is " + dog3.getLicenceNo());
        System.out.println("They are " + (dog3.isDangerous() ? "Dangerous" : "NOT Dangerous"));

        // call bark method for each dog
        dog1.bark();
        dog2.bark();
        dog3.bark();

        // print message for each dog based on the value of isDangerous attribute
        System.out.println(dog1.getName() + " has Licence number " + dog1.getLicenceNo() + " and is " + (dog1.isDangerous() ? "Dangerous" : "NOT Dangerous"));
        System.out.println(dog2.getName() + " has Licence number " + dog2.getLicenceNo() + " and is " + (dog2.isDangerous() ? "Dangerous" : "NOT Dangerous"));
        System.out.println(dog3.getName() + " has Licence number " + dog3.getLicenceNo() + " and is " + (dog3.isDangerous() ? "Dangerous" : "NOT Dangerous"));
    }
}
