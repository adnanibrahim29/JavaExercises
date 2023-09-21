public class Tester {
    public static void main(String[] args) {

        // Create SUV objects
        SUV suv1 = new SUV();
        SUV suv2 = new SUV(2, "Nissan", "4");

        // Create Car object
        Car car1 = new Car(3, "Ford", true);

        // Set values for suv1
        suv1.setBrand("BMW");
        suv1.setNoOfDoors(5);
        suv1.setDrive("rear");

        // Print details of suv1
        suv1.printDetails();
        System.out.println(suv1.getDrive());

        // Set noOfDoors for car1
        car1.setNoOfDoors(5);

        // Print details of car1 and whether it is a sportsModel
        car1.printDetails();
        System.out.println(car1.isSportsModel());
    }
}
