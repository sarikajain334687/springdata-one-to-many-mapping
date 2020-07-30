package com.ttalks.tls.springdata.onetomanymapping.repository;

import com.ttalks.tls.springdata.onetomanymapping.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
