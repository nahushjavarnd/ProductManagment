package com.app;

public class Shape {
	
		float length, breadth, height, side; 
		public float calculateArea() {
			return 0;
		}
	}
//child class of Shape
class Rectangle extends Shape {
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public float calculateArea() {
		return length * breadth;
	}	
}

//child class of Shape
class Triangle extends Shape {
	public Triangle(float breadth, float height ) {
		this.breadth = breadth;
		this.height = height;
	}
	@Override
	public float calculateArea() {
		
		return ((breadth * height) / 2);
	}
}

//child class of Shape
class Square extends Shape {
	public Square(float side) {
		this.side = side;
	}
	@Override
	public float calculateArea() {
		return (side * side);
	}	
}

