package lt.baltictalents.lesson6.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.baltictalents.lesson6.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{}