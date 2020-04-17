package wang.ismy.gradle.springboot;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author MY
 * @date 2020/4/17 19:59
 */
@Data
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    private Integer id;
    private String username;
}
