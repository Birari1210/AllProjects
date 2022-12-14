package com.yash.assingment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.assingment.model.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

}
