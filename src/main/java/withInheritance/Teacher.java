package withInheritance;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;



@SuperBuilder
public class Teacher extends Member {
    private String firstName;
    private String lastName;
    private String email;
    private List<String> courses;
    private int year;

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", courses=" + courses +
                ", year=" + year +
                '}';
    }
}
