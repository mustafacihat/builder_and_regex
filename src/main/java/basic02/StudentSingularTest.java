package basic02;

import lombok.*;

import java.util.Arrays;
import java.util.List;

@Builder
@ToString
public class StudentSingularTest {

    public static void main(String[] args) {

        StudentSingular studentSingular = StudentSingular.builder()
                .firstName("Michael")
                .lastName("Jordan")
                .email("jordan@email.com")
                .courses(Arrays.asList("Spring", "Java"))
                .year(1990).build();

        System.out.println(studentSingular);


    }
}
