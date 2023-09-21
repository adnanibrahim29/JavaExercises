public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom Daly", "Teacher", 45000);
        Employee e2 = new Employee("Mary Murphy", "Developer", 30000);
        Employee e3 = new Employee();
        
        System.out.println("Employee 2 is called " + e2.getName());
        System.out.println("They are a " + e2.getJobTitle());
        System.out.println("Their salary is " + e2.getSalary());
        System.out.println("Their Employee ID number is " + e2.getEmployeeID());
        
        e3.setName("Michael Higgins");
        e3.setJobTitle("President");
        e3.setSalary(1000);
        
        e1.showEmp();
        e2.showEmp();
        e3.showEmp();
        
        System.out.println(e1.toString());
    }
}