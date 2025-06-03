package Students.com;

import marks.Mark;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();
    private List<Mark> marks = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMark(Mark mark) {
        marks.add(mark);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Mark> getMarks() {
        return marks;
    }
}