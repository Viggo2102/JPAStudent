package com.example.jpastudent.Student.repository;

import com.example.jpastudent.Student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
