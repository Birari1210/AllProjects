package com.project.sma.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.sma.model.Stock;


@Repository
public interface CarRepo extends CrudRepository<Stock, Integer>
{

}
