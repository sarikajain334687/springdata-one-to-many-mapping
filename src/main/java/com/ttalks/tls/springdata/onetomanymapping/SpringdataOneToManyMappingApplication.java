package com.ttalks.tls.springdata.onetomanymapping;

import com.ttalks.tls.springdata.onetomanymapping.entity.Student;
import com.ttalks.tls.springdata.onetomanymapping.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ttalks.tls.springdata.onetomanymapping.entity.Class;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringdataOneToManyMappingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringdataOneToManyMappingApplication.class, args);
    }
    @Autowired
    private ClassRepository classRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Student> studentList = new ArrayList<Student>();

        Student student = new Student("Test1", "TestAddress", 1);
        Student student1 = new Student("Test2", "Test2Address", 2);

        studentList.add(student);
        studentList.add(student1);

        Class classofStudent = new Class("7th", "A", studentList);
        classRepository.save(classofStudent);


    }
}
