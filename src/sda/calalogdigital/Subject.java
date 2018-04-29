package sda.calalogdigital;

import java.util.List;
import java.util.Objects;

public class Subject {

    private String name;
    private List<Grade> grade;

    public Subject(String name)
    {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public List<Grade> getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
    

}
