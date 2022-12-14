package com.project.sma.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sma.model.Offers;
import com.project.sma.repo.OffersRepo;

@Service
public class OfferService {

	@Autowired
	OffersRepo objOffer;
	
	
	public void saveOffer( Offers offers) 
	{
		objOffer.save(offers);
	}

	public List<Offers> getAllOffers() 
	{
		List<Offers> listoffer= new ArrayList<Offers>();
		objOffer.findAll().forEach(listoffer::add);
		return listoffer;
	}

	public void deleteOfferById(int id) 
	{
		objOffer.deleteById(id);
	}

	public Offers getofferById(int id) 
	{
		Optional<Offers> optional = objOffer.findById(id);
		Offers obj=optional.get();
		return obj;
	}

}
