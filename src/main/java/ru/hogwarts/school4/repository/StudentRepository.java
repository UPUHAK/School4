package ru.hogwarts.school4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hogwarts.school4.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
