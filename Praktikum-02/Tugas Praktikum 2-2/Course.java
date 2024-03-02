/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 1 Februari 2023
  Deskripsi : Kelas Course dengan courseCode, courseName, lecture, dan list studentsEnrolled
*/
import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Lecture getlecture() {
        return lecture;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setlecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public List<Student> getstudentsEnrolled() {
        return studentsEnrolled;
    }

    void addStudent(Student student) {
        studentsEnrolled.add(student);
    }

    void removeStudent(Student student) {
        studentsEnrolled.remove(student);
    }

    void getDetails() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Lecture: " + lecture.getName());
        System.out.println();
    }  

    void viewEnrolledStudents() {
        System.out.println("=== List of students enrolled in " + courseCode + "-" + courseName + ": ===");
        for (Student student : studentsEnrolled) {
            student.getDetails();
        }
    }   
}
