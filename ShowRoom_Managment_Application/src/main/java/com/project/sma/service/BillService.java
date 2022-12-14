package com.project.sma.service;

import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.project.sma.model.Bill;
import com.project.sma.model.Offers;
import com.project.sma.repo.BillRepo;

@Service
public class BillService {

	@Autowired
	BillRepo objBrepo;
	
	@Autowired
	JdbcTemplate objjdbc;


	public void generateBill(Bill objbill) 
	{
		objBrepo.save(objbill);		
	}

	public Bill getBillByNo(int billId)
	{
		Optional<Bill> optional=objBrepo.findById(billId);
		Bill obj2=optional.get();
		return obj2;
	}

	public void saveBill(Bill objbill1) 
	{
		objBrepo.save(objbill1);
	}

	public void deleteBillById(int id)
	{
		objBrepo.deleteById(id);
		
	}

	public Bill getBillDetails(int id) 
	{
		Optional<Bill> optional=objBrepo.findById(id);
		Bill obj =optional.get();
		return obj;
	}
	


	public List<Bill> getAllBills()
	{
		List<Bill> billlist=new ArrayList<Bill>();
		objBrepo.findAll().forEach(billlist::add);
		return billlist;
	}

	public Bill showbillbyId(int id)
	{
		Optional<Bill> optional=objBrepo.findById(id);
		Bill obj2=optional.get();
		return obj2;
		
	}
}
