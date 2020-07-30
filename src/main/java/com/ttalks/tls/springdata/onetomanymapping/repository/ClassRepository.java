package com.ttalks.tls.springdata.onetomanymapping.repository;

import com.ttalks.tls.springdata.onetomanymapping.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Class, Long> {
}
