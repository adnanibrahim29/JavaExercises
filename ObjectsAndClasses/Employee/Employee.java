public class Employee {

    // Attributes
    private String name;
    private String jobTitle;
    private float salary;
    private int employeeID;

    // Class Variables
    private static int lastEmployeeID = 1000;

    // Default Constructor
    public Employee() {
        this.name = "Mary Jones";
        this.jobTitle = "Doctor";
        this.salary = 19000f;

        // Update the uniqueID class variable so no two employees have the same ID
        lastEmployeeID++;

        // Set the unique ID
        this.employeeID = lastEmployeeID;
    }

    // General Constructor
    public Employee(String name, String jobTitle, float salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.setSalary(salary);

        // Update the uniqueID class variable so no two employees have the same ID
        lastEmployeeID++;

        // Set the unique ID
        this.employeeID = lastEmployeeID;
    }

    // Accessors and Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(float salary) {
        if (salary >= 19000f) {
            this.salary = salary;
        } else {
            System.out.println("Entered salary of " + salary + " is too low. Salary set at minimum wage of 19000.0");
            this.salary = 19000f;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public float getSalary() {
        return this.salary;
    }

    public int getEmployeeID() {
        return this.employeeID;
    }

    public static int getLastEmployeeID() {
        return lastEmployeeID;
    }

    // Other Methods
    public void showEmp() {
        System.out.println("EMPLOYEE RECORD");
        String details = "NAME: " + this.name;
        details += "\nJOB TITLE: " + this.jobTitle;
        details += "\nCURRENT SALARY: " + this.salary;
        details += "\nEMPLOYEE ID: " + this.employeeID;
        System.out.println(details);
    }

    public String toString() {
        String details = "NAME: " + getName();
        details += "\nJOB TITLE: " + getJobTitle();
        details += "\nCURRENT SALARY: " + getSalary();
        details += "\nEMPLOYEE ID: " + getEmployeeID();
        return details;
    }
}
