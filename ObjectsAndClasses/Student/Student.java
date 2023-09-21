public class Student {
    private String name;
    private String course;
    private int studentID; 

    public Student(){
        this.name = "";
        this.course = "";
        this.studentID = 1000;
    }

    public Student(String name, String course, int studentID){
        this.name = name;
        this.course = course;
        this.studentID = studentID++;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public int getstudentID(){
        return studentID;
    }

    public void showStudent(){
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Student ID: " + studentID);
        System.out.println("---");
    }
}
