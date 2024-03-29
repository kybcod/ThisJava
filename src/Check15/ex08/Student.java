package Check15.ex08;

import java.util.Objects;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return studentNum == student.studentNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNum);
    }
}
