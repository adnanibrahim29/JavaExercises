public class Dog {
    private String name;
    private String breed;
    private int age;
    private int licenceNo;
    private boolean isDangerous;

    // static field to keep track of the next available licence number
    private static int nextLicenceNo = 1001;

    // default constructor
    public Dog() {
        this.name = "Unknown";
        this.breed = "Unknown";
        this.age = 0;
        this.licenceNo = nextLicenceNo++;
        this.isDangerous = false;
    }

    // general constructor
    public Dog(String name, String breed, int age, boolean isDangerous) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.licenceNo = nextLicenceNo++;
        this.isDangerous = isDangerous;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    public int getLicenceNo() {
        return licenceNo;
    }

    // bark method
    public void bark() {
        System.out.println(name + " has License number " + licenceNo + "says Woof! Woof! Woof!");
    }
}
