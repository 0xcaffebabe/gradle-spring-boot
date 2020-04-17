package wang.ismy.gradle.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author MY
 * @date 2020/4/17 19:59
 */
public interface UserRepository extends JpaRepository<User,Long> { }
