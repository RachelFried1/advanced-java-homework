package Marks.com;

public class Mark {
    private int studentId;
    private int score;

    public Mark(int studentId, int score) {
        this.studentId = studentId;
        this.score = score;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "studentId=" + studentId +
                ", score=" + score +
                '}';
    }
}
