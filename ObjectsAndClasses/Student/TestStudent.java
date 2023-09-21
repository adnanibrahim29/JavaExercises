import java.util.Scanner;

public class TestStudent{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] student = new Student[3];

        for(int i = 0; i < student.length; i++){
            System.out.println("Enter Student name: ");
            String name = sc.nextLine();
           
            System.out.println("Enter course name: ");
            String course = sc.nextLine();
           
            System.out.println("Enter Student ID: ");
            int studentID = sc.nextInt();
            sc.nextLine(); // Throwaway line

            student[i] = new Student(name, course, studentID);
            System.out.println();
        }
        sc.close();

        for(int i = 0; i < student.length; i++){
            student[i].showStudent();
        }

        for(int i = 0; i < student.length; i++){
            if(student[i].getName().equals("Jacob Gallagher")){
                student[i].setCourse("CSSE");
                break;
            }
        }
        for(int i = 0; i < student.length; i++){
            if(student[i].getName().equals("Jacob Gallagher")){
                student[i].showStudent();;
                break;
            }
        }
        
        for(int i = 0; i < student.length; i++){
            if(student[i].getName().equals("Louise Johnsen")){
                student[i].setName("Louise Johnson");
                System.out.println(student[i].getName());
                break;
            }
        }
    }
}