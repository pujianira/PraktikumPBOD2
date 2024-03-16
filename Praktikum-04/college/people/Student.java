/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 16 Februari 2023
  File      : Student.java
  Deskripsi : Representasi untuk objek student (mahasiswa)
*/

package college.people;

import java.util.List;
import java.util.ArrayList;

import college.person.Person;
import college.course.Course;

public class Student extends Person {
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void enrollInCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void viewEnrolledCourses() {
        System.out.println("=== List of courses " + name + " has enrolled in: ===");
        for (Course course : coursesEnrolled) {
            course.getDetails();
        }
    }
}