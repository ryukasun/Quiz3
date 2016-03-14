package base;
import java.math.*;
public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;



	public Triangle() { //no args constructor, gives the default 1.0 length for each side length
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
//		this.getArea();
//		this.getPerimeter();
		
		// TODO Auto-generated constructor stub
	}
	public Triangle(double side1, double side2,double side3) { //the overloaded argument, given the 3 side lengths
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	
		// TODO Auto-generated constructor stub
	}

	public Triangle(double side1, double side2,double side3, String color, boolean filled) {//simply calls the color and filled from the super class, still has 3 side lengths
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		// TODO Auto-generated constructor stub
	}



	public double getSide1() {//next 6 functions are simply getters and setters for side1,side2,side3
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	@Override
	public double getArea() {//calculates area using Heron's formula, 
		double halfPerim = .5*(getSide1()+getSide2()+getSide3());
		double Area = Math.sqrt(halfPerim*(halfPerim-getSide1())*(halfPerim-getSide2())*(halfPerim-getSide3()));
		return Area;
	}

	@Override
	public double getPerimeter() {//calculates perimeter simply by adding all the area
		double Perimeter = (getSide1()+getSide2()+getSide3());
		return Perimeter;
	}

	@Override
	public String toString() {//just outputs a string that gives info about the triangle
		return "side1 is " + side1 + ", side2 is " + side2 + ",side3 is " + side3 + "/n,perimeter is " + getPerimeter() + "and area is "
				+ getArea();
		
		
	}
}
