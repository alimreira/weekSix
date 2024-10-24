package setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int age;
    private String academicLevel;

    // Injected Dependency
    private Course course;

    public Student() {
    }

    public Student(String name, int age, String academicLevel) {
        this.name = name;
        this.age = age;
        this.academicLevel = academicLevel;
    }

    // Setter Injection with @Autowired
    @Autowired
    public void setCourse(Course course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", academicLevel='" + academicLevel + '\'' +
                ", course=" + course + // Display course details
                '}';
    }
}
