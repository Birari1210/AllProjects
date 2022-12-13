package com.training.demo;

public class BoxMaster {

	public static void main(String[] args) {

		Box b = new Box(10, 20, 5);
		System.out.println("valume of box "+b.calcVolume());
		
		BoxWeight bw = new BoxWeight(2,6,89,9);
		System.out.println("box density"+bw.calcDensity());
		
		
	}

}
