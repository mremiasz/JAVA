package pl.edu.uj.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pl.edu.uj.entities.Person;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Long> {
    List<Person> findByName(String name);

    List<Person> findById(Integer id);

    @Query("SELECT r.name FROM Person r")
    List<String> findAllNames();

    @Query("SELECT r.name FROM Person r WHERE r.role.name = :roleName")
    List<String> findNameByRole(@Param(value = "roleName") String roleName);

    @Query("SELECT r.name FROM Person r WHERE r.name LIKE :letter%")
    List<String> findNameByLetter(@Param(value = "letter") String letter);
}