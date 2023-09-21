import java.util.Scanner;

public class TestPerson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] people = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Person " + (i+1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            people[i] = new Person(name, address);
        }

        // print info for Person 1
        System.out.println("Person 1 is called " + people[0].getName());
        System.out.println("They live in " + people[0].getAddress());
        System.out.println("Their PPS Number is " + people[0].getPPSNo() + ".");

        // change info for Person 2
        people[1].setName("Paul Smyth");
        people[1].setAddress("Dublin");

        // print info for all people
        for (Person person : people) {
            person.showPerson();
        }

        // call toString() on Person 3
        System.out.println(people[2].toString());
    }
}
