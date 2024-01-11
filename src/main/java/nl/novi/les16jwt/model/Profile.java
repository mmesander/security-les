package nl.novi.les16jwt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "profiles")
public class Profile {
    @Id
    private String username;
    private String lastname;
    private String firstname;
    private String address;
    private String bankAccount;
}
