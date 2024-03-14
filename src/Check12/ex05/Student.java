package Check12.ex05;

import java.util.Objects;

public class Student {
    private String  studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum(){
        return studentNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        return Objects.equals(studentNum, student.studentNum);
    }

    @Override
    public int hashCode() {
        return studentNum != null ? studentNum.hashCode() : 0;
    }
}
