package basic02;

import lombok.*;

import java.util.List;


@Data
@Builder
public class StudentSingular {

    @NonNull // this annotation makes sure firstName field is a mandatory field, or we need to assign value to this field.
    private String firstName;
    private String lastName;
    private String email;
    @Singular // This singular annotation enables adding a single item to the collection.
    private List<String> courses;

    @Builder.Default
    private int year = 1998;
}
