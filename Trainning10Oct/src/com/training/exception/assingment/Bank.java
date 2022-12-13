package com.training.exception.assingment;

public class Bank {

	private int deposite;
	private int withdraw;
	
	
	public Bank(int deposite, int withdraw) {
		this.deposite = deposite;
		this.withdraw = withdraw;
	}

	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public int getDeposite()  {
		
		
			
		return deposite;
	}

	public void setDeposite(int deposite) throws InvalidBalanceException   {
		
		if(deposite<10000)
		{
			 throw new InvalidBalanceException("please Enter balance deposite greater than 100000");
		}
		
		this.deposite = deposite;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw)  throws InvalidBalanceException {
		
		if(withdraw<1000)
		{
			 throw new InvalidBalanceException("you can not withdraw balance less than 1000");
		}
		this.withdraw = withdraw;
	}

	
	public static void main(String[] args) {
		
		Bank b = new Bank();

		try {
			b.setDeposite(100);
			System.out.println(b.getDeposite());

		} catch (InvalidBalanceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

		try {
			b.setWithdraw(100);
			System.out.println(b.getWithdraw());
			
		} catch (InvalidBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
		
	}

}
