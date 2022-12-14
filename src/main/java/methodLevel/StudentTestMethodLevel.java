package methodLevel;

public class StudentTestMethodLevel {

    public static void main(String[] args) {

        Student student = Student.studentMethodLevel()
                .firstName("Michael")
                .lastName(("Jordan"))
                .build();

        System.out.println(student);
    }
}
