package basic01;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private String firstName;
    private String lastName;
    private String email;
    private List<String> courses;
    private int year;
}
