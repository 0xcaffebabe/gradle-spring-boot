package wang.ismy.gradle.springboot;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author MY
 * @date 2020/4/17 19:55
 */
@RestController
@AllArgsConstructor
public class Controller {
    private final UserRepository userRepository;

    @GetMapping("")
    public List<User> home(){
        return userRepository.findAll();
    }
}
