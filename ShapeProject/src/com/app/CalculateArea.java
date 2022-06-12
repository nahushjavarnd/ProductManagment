package com.app;

import java.util.Scanner;

public class CalculateArea {
	
	public CalculateArea() {
		areaCalculation(); 
	}
	public void areaCalculation() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n_______________________________________________________");
		System.out.println("\n=================*** CALCULATER  ***===================");
		System.out.println("hi, Welcome to the Area Calculater!");
		System.out.println("\n_______________________________________________________");
		
		
		while(true) {
			
			System.out.println("\nwhich Shape of are you want to calculate ? ");
			System.out.println("1 for Rectangle");
			System.out.println("2 for Triangle");
			System.out.println("3 for Sqare");
			System.out.println("4 Exit");
			
			System.out.println("\nSelect any one Option");
			
	
			int option = sc.nextInt();
			
			if (option == 1) {
				
				System.out.print("Enter the length of Rectangle : ");
	            float length = sc.nextFloat();
	            System.out.print("Enter the width of Rectangle : ");
	            float width = sc.nextFloat();
	            
	            Rectangle rectangle = new Rectangle(length, width);
	            System.out.println("\n____________________________________________");
	            System.out.println("Area of Rectangle is : " + rectangle.calculateArea());
	            System.out.println("____________________________________________");
			}
			else if (option == 2) {
				
	            System.out.print("Enter the width of Triangle : ");
	            float width = sc.nextFloat();
	            System.out.print("Enter the height of Triangle : ");
	            float height = sc.nextFloat();
	            
	            Triangle taiangle = new Triangle(width, height);
	            System.out.println("\n____________________________________________");
	            System.out.println("Area of Triangle is : " + taiangle.calculateArea());
	            System.out.println("____________________________________________");
			}
			else if (option == 3) {
				
	            System.out.print("Enter the Side of Sqaure : ");
	            float side = sc.nextFloat();
	            
	            Square saquare = new Square(side);
	            System.out.println("\n____________________________________________");
	            System.out.println("Area of Square is : " + saquare.calculateArea());
	            System.out.println("____________________________________________");
			}
			else if (option == 4) {
				System.exit(0);
			}
			else {
				System.out.println("Enter the Correct option");
			}
		}
	}
}


