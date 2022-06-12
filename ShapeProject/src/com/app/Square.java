package com.app;

public class Square extends Shape{
	public Square(float side) {
		this.side = side;
	}
	@Override
	public float calculateArea() {
		return (side * side);
	}	

}
