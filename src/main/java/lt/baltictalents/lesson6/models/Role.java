package lt.baltictalents.lesson6.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
@ToString
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "name", columnDefinition = "ENUM('ADMIN','EDITOR','USER','ANONYMOUS')", nullable = false)
    @Getter
    @Setter
    private RoleName name;

    @ManyToMany(
            mappedBy = "roles"
    )

    @Getter
    @Setter
    private Set<User> users;


  enum RoleName{
    ADMIN,
    EDITOR,
    USER,
    ANONYMOUS
    }
}