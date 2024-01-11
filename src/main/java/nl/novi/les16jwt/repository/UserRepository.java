package nl.novi.les16jwt.repository;

import nl.novi.les16jwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
