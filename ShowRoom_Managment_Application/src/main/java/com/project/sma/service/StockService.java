package com.project.sma.service;

import java.util.ArrayList;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sma.model.Stock;
import com.project.sma.repo.CarRepo;

@Service
public class StockService {

	@Autowired
	CarRepo objRepo;
	

	public int saveStock(Stock objstock) {
		// TODO Auto-generated method stub
		objstock=objRepo.save(objstock);	
		int id=objstock.getItemId();
	//	System.out.println(objstock.getTotalPrice());
		return id;
	}

	public  List<Stock> getAllitems() {

		List<Stock> itemList = new ArrayList<Stock>();		
		objRepo.findAll().forEach(itemList::add);
		return itemList;
	}
	
	public Stock getItemById(int id)
	{
		Optional<Stock> optional=objRepo.findById(id);
		Stock objstock=optional.get();
		return objstock;
	}
	

}
