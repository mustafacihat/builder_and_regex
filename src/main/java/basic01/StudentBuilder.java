package basic01;

import java.util.ArrayList;
import java.util.List;

public class StudentBuilder {

    private String firstName="";
    private String lastName="";
    private String email = "";
    List<String> courses = new ArrayList<>();
    private int year = 0;

    public StudentBuilder firstName(String firstName){
        this.firstName=firstName;
        return this;
    }

    public StudentBuilder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder email(String email){
        this.email=email;
        return this;
    }

    public StudentBuilder courses(List<String> courses){
        this.courses = courses;
        return this;
    }

    public StudentBuilder course(String course){
        this.courses.add(course);
        return this;
    }

    public StudentBuilder year(int year){
        this.year= year;
        return this;
    }

    public Student build(){
        return new Student(firstName,lastName,email,courses,year);
    }
}
