package ru.hogwarts.school4.service;

import ru.hogwarts.school4.model.Student;

import java.util.List;

public interface StudentService {

    Student create(Student student);

    Student read(Long id);

    Student update(Long id, Student student);

    void delete(Long id);

    List<Student> getAllByAge(int age);
}
