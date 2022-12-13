package com.springcore.ass14;

public class Square  implements Shape{

	double s;
	
	public Square(double s) {
		super();
		this.s = s;
	}

	@Override
	public double Area() {
		
		return s*s;
	}

	@Override
	public double Sides() {
	
		return 0;
	}

}
