package sda.calalogdigital;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<Student> student;
    private String numeClasa;

    public Catalog (String numeClasa) {
        this.numeClasa = numeClasa;
        student = new ArrayList<>();
    }
    public String getNumeClasa() {
        return numeClasa;
    }

    public void printGradesByStudent(Student pupile) {
        for (Student st: student) {
            if (st.equals(pupile)) {
                st.printAllGrades(); //TBD issue#19
            }
        }
    }

}