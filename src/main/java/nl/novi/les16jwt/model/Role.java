package nl.novi.les16jwt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "roles")
public class Role {
    // Variables
    @Id
    private String rolename;

    // Relations
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}