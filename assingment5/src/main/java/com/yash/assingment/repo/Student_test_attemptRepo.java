package com.yash.assingment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.assingment.model.Student_test_attempt;

@Repository
public interface Student_test_attemptRepo extends JpaRepository<Student_test_attempt, Integer> {

}
