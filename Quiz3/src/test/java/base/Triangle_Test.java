package base;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void PerimeterTest() {
		double side1 = 3;
		double side2 = 4;
		double side3 = 5;
		Triangle A =  new Triangle(3,4,5);
		Triangle B = new Triangle();
		A.getPerimeter();
		B.getPerimeter();
		assertTrue(12 ==A.getPerimeter());
		assertFalse(6==A.getPerimeter());
		assertTrue(3 == B.getPerimeter());
		assertFalse(4 == B.getPerimeter());
		}
		


	@Test
	public void AreaTest() {
		double side1 = 3;
		double side2 = 4;
		double side3 = 5;
		Triangle A =  new Triangle(3,4,5);
		Triangle B = new Triangle();
		A.getArea();
		B.getArea();
		assertTrue(6.0==A.getArea());
		assertFalse(7.0 ==A.getArea());
		assertFalse(20 == B.getArea());
	}


}
