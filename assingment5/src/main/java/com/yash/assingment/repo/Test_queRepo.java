package com.yash.assingment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.assingment.model.Test_question;


public interface Test_queRepo extends JpaRepository<Test_question, Integer> {

}
