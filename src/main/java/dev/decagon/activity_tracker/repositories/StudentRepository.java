package dev.decagon.activity_tracker.repositories;

import dev.decagon.activity_tracker.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


    Optional<Student> findByEmailAndPassword(String email, String password);


}
