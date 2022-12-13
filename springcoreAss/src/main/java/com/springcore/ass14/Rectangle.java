package com.springcore.ass14;

public class Rectangle implements Shape {

	double l;
	double b;

		public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}
	
		@Override
		public double Area()
		{
			return l*b;
		}

		@Override
		public double Sides() {
			return (2*l*b);
		}
		
}

