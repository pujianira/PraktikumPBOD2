/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 16 Februari 2023
  File      : Lecture.java
  Deskripsi : Representasi untuk objek lecture (dosen)
*/

package college.people;

import java.util.List;
import java.util.ArrayList;

import college.person.Person;
import college.course.Course;

public class Lecture extends Person {
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    } 

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course); 
    }

    public void viewTaughtCourses() {
        System.out.println("=== List of courses " + name + " is teaching in: ===");
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }
}
