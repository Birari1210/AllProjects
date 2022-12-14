package com.project.sma.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.sma.model.Offers;

@Repository
public interface OffersRepo extends CrudRepository<Offers, Integer> {

}
