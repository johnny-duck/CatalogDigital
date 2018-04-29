package sda.calalogdigital;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private String fatherInit;
    private List<Subject> subject;

    public Student(String name, String fatherInit){
        this.name = name;
        this.fatherInit = fatherInit;
        this.subject = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getFatherInit() {
        return fatherInit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(fatherInit, student.fatherInit);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, fatherInit);
    }

    public double calcGeneralAverage(){
        double sum = 0;
        double average;
        for(int i=0; i<=subject.size(); ++i){
            sum += subject.get(i).calcAverage();
        }
        average = sum/subject.size();
        return average;

    public void printAllGrades() {
        System.out.println("Grades for " + this.name + ": ");
        for (Subject subj : this.subject) {
            subj.printGrades(); //TBD issue#22
        }
    }
}
