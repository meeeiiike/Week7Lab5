package ie.atu.week7lab5;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByEmployeeId(String employeeId);

    Person removePersonById(Long id);

    Person removePersonByEmployeeId(String employeeId);
}
