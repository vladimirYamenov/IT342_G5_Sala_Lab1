package IT342_G6_SALA_Lab1.Backend.Controller;

import IT342_G6_SALA_Lab1.Backend.model.User;
import IT342_G6_SALA_Lab1.Backend.Repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/me")
    public User getUser() {
        // placeholder (will secure via JWT filter)
        return userRepository.findAll().get(0);
    }
}
