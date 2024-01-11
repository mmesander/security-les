package nl.novi.les16jwt.repository;

import nl.novi.les16jwt.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, String> {

}
