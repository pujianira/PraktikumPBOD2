/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 1 Februari 2023
  Deskripsi : Kelas Lecture dengan name, age, address, employeeID,  dan list coursesTaught
*/
import java.util.List;
import java.util.ArrayList;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
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

    public int getEmployeeID() {
        return employeeID;
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

    public List<Course> getcoursesTaught() {
        return coursesTaught;
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course); 
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Employee ID: " + employeeID);
        System.out.println();
    }   

    public void viewTaughtCourses() {
        System.out.println("=== List of courses " + name + " is teaching in: ===");
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }
}
