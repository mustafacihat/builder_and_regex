package basic01;


import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private List<String> courses;
    private int year;

    public Student(String firstName, String lastName, String email, List<String> courses, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.courses = courses;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", courses=" + courses +
                ", year=" + year +
                '}';
    }
}
