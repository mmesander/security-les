package nl.novi.les16jwt.repository;

import nl.novi.les16jwt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
}
