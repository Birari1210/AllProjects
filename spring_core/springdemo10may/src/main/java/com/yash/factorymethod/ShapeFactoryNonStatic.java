package com.yash.factorymethod;

public class ShapeFactoryNonStatic {
	public Shape getShapeObject()
	 {
		return new Square();
	 }
}
