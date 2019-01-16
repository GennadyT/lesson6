package lt.baltictalents.lesson6.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String password;

    @Transient
    @Getter
    @Setter
    private String passwordConfirm;

    @ManyToMany(
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name ="user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    @Getter
    @Setter
    private Set<Role> roles;
}
