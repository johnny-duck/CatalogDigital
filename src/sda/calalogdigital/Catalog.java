package sda.calalogdigital;

import java.util.List;

public class Catalog {

    private List<Student> student;
    private String numeClasa;

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
}