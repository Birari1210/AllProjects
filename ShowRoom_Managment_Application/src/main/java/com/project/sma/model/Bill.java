package com.project.sma.model;

import java.time.LocalDate;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bill {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		int bilNo;
		LocalDate billDate;
		String custName;
		String custPhone;
		String custAddress;
		String saleName;
		String itemName;
		int quantity;
		double price;
		double finalPrice; 
		double salePrice;
		double totalValue;
		
		public int getBilNo() {
			return bilNo;
		}
		public void setBilNo(int bilNo) {
			this.bilNo = bilNo;
		}
		public LocalDate getBillDate() {
			return billDate;
		}
		public void setBillDate(LocalDate billDate) {
			this.billDate = billDate;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public String getCustPhone() {
			return custPhone;
		}
		public void setCustPhone(String custPhone) {
			this.custPhone = custPhone;
		}
		public String getCustAddress() {
			return custAddress;
		}
		public void setCustAddress(String custAddress) {
			this.custAddress = custAddress;
		}
		public String getSaleName() {
			return saleName;
		}
		public void setSaleName(String saleName) {
			this.saleName = saleName;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public double getFinalPrice() {
			return finalPrice;
		}
		public void setFinalPrice(double finalPrice) {
			this.finalPrice = finalPrice;
		}
		public double getSalePrice() {
			return salePrice;
		}
		public void setSalePrice(double salePrice) {
			this.salePrice = salePrice;
		}
		public double getTotalValue() {
			return totalValue;
		}
		public void setTotalValue(double totalValue) {
			this.totalValue = totalValue;
		}
		
}
