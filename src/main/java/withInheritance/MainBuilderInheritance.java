package withInheritance;

public class MainBuilderInheritance {

    public static void main(String[] args) {
        var teacher = Teacher.builder()
                .memberShipNumber(100L)
                .build();

        System.out.println(teacher);
    }
}
