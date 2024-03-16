/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 16 Februari 2023
  File      : Main.java
  Deskripsi : Driver kelas main untuk kelas Lecture, Student, dan Course
*/

package college.main;

import college.course.Course;
import college.people.*;

public class Main {
    public static void main(String[] args) {
        Lecture L001 = new Lecture("Dr. Aulia Rahmawati", 40, "Jalan Wonolopo Utara II", 300803);
        Lecture L002 = new Lecture("Gita Prihardini, M.Kom.", 33, "Graha Taman Bunga VIII", 201203);
        
        Student S001 = new Student("Pujiani Rahayu Agustin", 19, "Jalan Candi Kalasan V", 243067);
        Student S002 = new Student("Keisya Intan Nabila", 19, "Jalan Baskoro III", 243063);
        Student S003 = new Student("Alya Safina", 19, "Dinar Mas IV", 244123);
        
        Course AIK21312 = new Course("AIK21312", "Systems Fundamentals", L001);
        Course AIK21321 = new Course("AIK21321", "Programming and Algorithms", L001);
        Course AIK21334 = new Course("AIK21334", "Numerical Methods", L002);
        
        L001.teachCourse(AIK21312);
        L001.teachCourse(AIK21321);
        L002.teachCourse(AIK21334);
    
        AIK21312.addStudent(S001);
        AIK21312.addStudent(S002);
        AIK21312.addStudent(S003);
    
        AIK21321.addStudent(S001);
        AIK21321.addStudent(S002);
    
        AIK21334.addStudent(S001);
        AIK21334.addStudent(S003);
        
        S001.enrollInCourse(AIK21334);
        S001.enrollInCourse(AIK21321);
        S001.enrollInCourse(AIK21312);
  
        S002.enrollInCourse(AIK21312);
        S002.enrollInCourse(AIK21321);
  
        S003.enrollInCourse(AIK21312);
        S003.enrollInCourse(AIK21334);
  
        L001.viewTaughtCourses();
        L002.viewTaughtCourses();
  
        S001.viewEnrolledCourses();
        S002.viewEnrolledCourses();
        S003.viewEnrolledCourses();
        
        AIK21312.viewEnrolledStudents();
        AIK21312.removeStudent(S003);
        System.out.println("--- Remove Student S003 ---");
        AIK21312.viewEnrolledStudents();
  
        AIK21321.viewEnrolledStudents();
        AIK21321.addStudent(S003);
        System.out.println("--- Add Student S003 ---");
        AIK21321.viewEnrolledStudents();
  
        AIK21334.viewEnrolledStudents();
        AIK21334.removeStudent(S001);
        System.out.println("--- Remove Student S001 ---");
        AIK21334.viewEnrolledStudents();
      }
}
