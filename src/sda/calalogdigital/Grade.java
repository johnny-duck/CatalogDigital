package sda.calalogdigital;

import java.util.Calendar;
import java.util.Objects;

public class Grade {
    private Integer value;
    private Calendar date;

    public Grade(int value, Calendar date) {
        this.value = value;
        this.date = date;
    }

    public int getValue() {
        return value;
    }

    public Calendar getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return value.equals(grade.value) &&
                Objects.equals(date, grade.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, date);
    }
}
