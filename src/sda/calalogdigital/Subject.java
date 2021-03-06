package sda.calalogdigital;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class Subject {

    private String name;
    private List<Grade> grade;

    public Subject(String name){
        this.name = name;
        this.grade = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public List<Grade> getGrade(){
        return grade;
    }

    public void addGrades(Grade grade){
        this.grade.add(grade);
    }

    public double calcAverage(){
        double sum = 0;
        double average;
        for(int i=0; i<=grade.size(); ++i){
            sum += grade.get(i).getValue();
        }
        average = sum/grade.size();
        return average;
    }

    public void printGrades() {
        System.out.println(this.getName() + ": ");
        for(Grade gr : this.grade) {
            System.out.println("- " + gr.getValue() + " - "
                    + gr.getDate().get(Calendar.DAY_OF_MONTH) + "."
                    + gr.getDate().get(Calendar.MONTH) + "."
                    + gr.getDate().get(Calendar.YEAR));
        }
    }

    @Override
    public boolean equals(Object o){
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
