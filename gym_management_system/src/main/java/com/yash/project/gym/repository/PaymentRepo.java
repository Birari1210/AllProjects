package com.yash.project.gym.repository;

import org.springframework.data.repository.CrudRepository;

import com.yash.project.gym.model.Payment;

public interface PaymentRepo extends CrudRepository<Payment,Integer> {

}
