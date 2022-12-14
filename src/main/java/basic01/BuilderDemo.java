package basic01;

import java.util.Arrays;

public class BuilderDemo {
    public static void main(String[] args) {

        Student student = new StudentBuilder()
                .firstName("Michael")
                .lastName("Jordan")
                .email("jordan@email.com")
                .courses(Arrays.asList("Spring","Java"))
                .year(1990)
                .build();

        System.out.println(student);

        Teacher teacher = Teacher.builder()
                .firstName("Michael")
                .lastName("Jordan")
                .email("jordan@email.com")
                .courses(Arrays.asList("Spring","Java"))
                .year(1990)
                .build();
        System.out.println(teacher);
    }
}
