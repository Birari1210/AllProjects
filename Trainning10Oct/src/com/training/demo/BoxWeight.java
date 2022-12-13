package com.training.demo;

public class BoxWeight extends Box1 {
	
	 private int weight;
	 

	public BoxWeight() {
		
		System.out.println("in boxweight cons 0 args ");
	}

	public BoxWeight(int weight, int hight, int breadth, int length ) {
		super();
		this.weight = weight;
		this.hight = hight;
		this.breadth = breadth;
		this.length = length;
		System.out.println("boxweight 4 arg constructor");
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	 
	public int calcDensity()
	{
		return this.breadth*this.hight*this.length*this.weight;
	}
	 
   

}
