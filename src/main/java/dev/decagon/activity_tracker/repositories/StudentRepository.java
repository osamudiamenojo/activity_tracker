package dev.decagon.activity_tracker.repositories;

import dev.decagon.activity_tracker.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByEmailAndPassword(String email, String password);


}
