package setterInjection;

import org.springframework.stereotype.Component;

@Component
public class Course {
    private String name;
    private int durationInMinutes;

    public Course() {
    }

    public Course(String name, int durationInMinutes) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                '}';
    }
}
