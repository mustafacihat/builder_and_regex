package withInheritance;

import lombok.experimental.SuperBuilder;

import java.util.Date;

@SuperBuilder
public class Member {

    private long memberShipNumber;
    private Date memberShipStartDate;

}
