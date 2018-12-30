package pl.edu.uj.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.edu.uj.entities.Role;

import java.util.List;

public interface RoleRepository extends CrudRepository<Role, Long> {
    List<Role> findByName(String name);
}
