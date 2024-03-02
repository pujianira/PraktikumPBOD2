/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 1 Februari 2023
  Deskripsi : Kelas Student dengan name, age, address, studentID,  dan list coursesEnrolled
*/
import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Course> getcoursesEnrolled() {
        return coursesEnrolled;
    }

    public void enrollInCourse(Course course) {
        coursesEnrolled.add(course);
    }
    
    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Student ID: " + studentID);
        System.out.println();
    }

    public void viewEnrolledCourses() {
        System.out.println("=== List of courses " + name + " has enrolled in: ===");
        for (Course course : coursesEnrolled) {
            course.getDetails();
        }
    }
}
