package com.training.demo;

 abstract class Shape
{
	abstract void draw();
}

class Reactangle extends Shape
{
	void draw()
	{
		
		System.out.println("print  rectangle");
	}
}

class Triangle extends Shape
{
	void draw()
	{
		System.out.println("print  Triangle");
	}
	
}

class Square extends Shape
{

	void draw()
	{
		System.out.println("print  Square");
	}
}

public class ShapeMaster {

	public static void main(String[] args) {
 
		Shape s2 = new Triangle();
		
		s2.draw();
		
		Shape []a= {new Square(), new Triangle(),new Reactangle()};
		
		for (Shape shape : a) 
		{
			shape.draw();
		}
			
		
	}
}
