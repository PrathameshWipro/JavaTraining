package com.Package;

public class Main {
	public static void main(String[] args) {
		Circle circle=new Circle(5);
		Rectangle rectangle =new Rectangle(4,6);
		
		System.out.println("Circle area :"+circle.area());
		System.out.println("Rectangle area"+rectangle.area());
	}

}
