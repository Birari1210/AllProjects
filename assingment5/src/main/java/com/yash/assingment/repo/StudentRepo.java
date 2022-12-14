package com.yash.assingment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.assingment.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
