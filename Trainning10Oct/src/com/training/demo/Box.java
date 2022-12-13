package com.training.demo;

public class Box {

	private int hight;
	private int breath;
	private int length;
	
	
	public Box(int hight, int breath, int length) {
		super();
		this.hight = hight;
		this.breath = breath;
		this.length = length;
	}
	
	
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int getBreath() {
		return breath;
	}
	public void setBreath(int breath) {
		this.breath = breath;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
	public int calcVolume()
	{
		return length*breath*hight;
	}


	
	
}
