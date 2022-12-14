package com.project.sma.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.sma.model.Bill;

@Repository
public interface BillRepo extends CrudRepository<Bill, Integer>{

}
