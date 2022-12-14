package constructorLevel;

public class StudentConstructorTest {

    public static void main(String[] args) {

        Student student = Student.builder()
                .firstName("Hamza")
                .lastName("Serdar Ali")
                .email("hamza@test.com")
                .build();

        System.out.println(student);

        Student student1 = new Student("Michael","Jordan","email",null,1990);
    }
}
