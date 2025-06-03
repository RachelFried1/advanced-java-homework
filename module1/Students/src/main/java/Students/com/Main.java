package Students.com;

import Marks.Mark;

public class Main {
    public static void main(String[] args) {
        // Create instances of Student
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");

        // Create an instance of StudentService
        StudentService studentService = new StudentService();

        // Add students
        studentService.addStudent(student1);
        studentService.addStudent(student2);

        // Create instances of Mark
        Mark mark1 = new Mark(student1.getId(), 85);
        Mark mark2 = new Mark(student2.getId(), 90);

        // Add marks
        studentService.addMark(mark1);
        studentService.addMark(mark2);

        // Display students and their marks
        for (Student student : studentService.getStudents()) {
            System.out.println("Student Name: " + student.getName());
            for (Mark mark : studentService.getMarks()) {
                if (mark.getStudentId() == student.getId()) {
                    System.out.println("Mark: " + mark.getScore());
                }
            }
        }
    }
}