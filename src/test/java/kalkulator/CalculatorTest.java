package kalkulator;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

	@Test
	public void testAddOne(){
		// Arrange
		// sut = System Under Test
		Calculator sut = new Calculator();
		// Act
		sut.add(1);
		// Assert
		assertEquals("0+1 = 1", 1, sut.getState());
	}

	@Test
	public void testAddMinusOne(){
		// Arrange
		// sut = System Under Test
		Calculator sut = new Calculator();
		// Act
		sut.add(-1);
		// Assert
		assertEquals("0-1 = 1", -1, sut.getState());
	}

	@Test
	public void testMultOneByTwo(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.mult(2);
		assertEquals("1*2 = 2", 2, sut.getState());
	}

	@Test
	public void testMultOneByZero(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.mult(0);
		assertEquals("1*0 = 0", 0, sut.getState());
	}

	@Test
	public void testSubZero(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.sub(0);
		assertEquals("1-0 = 1", 1, sut.getState());
	}

	@Test
	public void testSubTwoFromFour(){
		Calculator sut = new Calculator();
		sut.setState(4);
		sut.sub(2);
		assertEquals("4-2 = 2", 2, sut.getState());
	}

	@Test
	public void testSubTwoFromZero(){
		Calculator sut = new Calculator();
		sut.sub(2);
		assertEquals("0-2 = -2", -2, sut.getState());
	}

	@Test
	public void testDivByTwo(){
		Calculator sut = new Calculator();
		sut.setState(6);
		sut.div(2);
		assertEquals("6/2 = 3", 3, sut.getState());
	}

	@Test
	public void testZeroByTwo(){
		Calculator sut = new Calculator();
		sut.div(2);
		assertEquals("0/2 = 0", 0, sut.getState());
	}

	@Test
	public void DivByZero(){
		Calculator sut = new Calculator();
		sut.setState(2);
		sut.div(0);
	}
}

