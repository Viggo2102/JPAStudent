package com.example.jpastudent.config;

import com.example.jpastudent.Student.model.Student;
import com.example.jpastudent.Student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("Viktor");
        s1.setBornDate(LocalDate.of(1997,02,21));
        s1.setBornTime(LocalTime.of(10, 11, 12));
        studentRepository.save(s1);
        Student s2 = new Student();
        s2.setName("Mads");
        s2.setBornDate(LocalDate.of(2000,1,12));
        s2.setBornTime(LocalTime.of(10,10,10));
        studentRepository.save(s2);

        List<Student> students = Arrays.asList(

        new Student("Charlie", LocalDate.of(1997,02,21),LocalTime.of(10,11)),
        new Student("Per", LocalDate.of(1997,02,21),LocalTime.of(10,11)),
        new Student("Mona", LocalDate.of(1997,02,21),LocalTime.of(10,11))
        );
        studentRepository.saveAll(students);

        studentRepository.save(new Student("Peter Larsen", LocalDate.of(1980, 02,21), LocalTime.of(01,02,03)));
    }
}
