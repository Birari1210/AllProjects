package com.training.demo;

public class Box1 {

	protected int hight;
	protected int breadth;
	protected int length;
	
    Box1()
	{
		this(0);
		   System.out.println("box class 0 arg constructor");

	}
	
   Box1(int length)
   {
	   this(0,0,0);
	   System.out.println("box class 1 arg constructor");
   }
	
	public Box1(int hight, int breadth, int length) {
		super();
		this.hight = hight;
		this.breadth = breadth;
		this.length = length;
		   System.out.println("box class 3 arg constructor");

	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Box1 [hight=" + hight + ", breadth=" + breadth + ", length=" + length + "]";
	}
	
	
	
}
