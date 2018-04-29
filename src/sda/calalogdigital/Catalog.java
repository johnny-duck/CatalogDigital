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

    public boolean addStudent(Student student){
        for(Student s : this.student){
            if(!s.equals(student)){
                this.student.add(student);
                return true;
            }
        }
        return false;
    }
  
    public void printGradesByStudent(Student pupile) {
        for (Student st: student) {
            if (st.equals(pupile)) {
                st.printAllGrades(); //TBD issue#19
            }
        }
    }

    public void printByGenAverageLowerThan(double avg){
        for(Student s : this.student){
            if(s.calcGeneralAverage()<avg){
                s.printAllGrades();
            }
        }
    }

}