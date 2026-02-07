package IT342_G6_SALA_Lab1.Backend.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import IT342_G6_SALA_Lab1.Backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User>findByEmail(String email);
}
