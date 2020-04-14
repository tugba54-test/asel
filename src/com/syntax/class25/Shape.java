package com.syntax.class25;

public interface Shape {
	static double pi=3.14;
 public void CalculateArea(double r);
 public void CalculatePerimeter(double r);

}
class Circle implements Shape{
@Override
	public void CalculateArea(double r) {
		
		System.out.println(" the area of circle is "+pi*r*r);
		
	}

	@Override
	public void CalculatePerimeter(double r) {

		System.out.println(" the perieter  of circle is "+2*pi*r*r);
		
	}
	
}
class Square implements Shape{



	@Override
	public void CalculateArea(double r) {
		System.out.println(" the area of square is "+r*r);		
	}

	@Override
	public void CalculatePerimeter(double r) {
		System.out.println(" the perimeter  of given square is "+4*r);		
	}
	
}