package kalkulator;

import org.junit.*;

import static org.junit.Assert.assertEquals;

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
	public void testAddNegativeNumbers(){
		Calculator sut = new Calculator();
		sut.setState(5);
		sut.add(-1);
		assertEquals("5 + (-1) = 4", 4, sut.getState());
		sut.add(-10);
		assertEquals("4 + (-10) = -6", -6, sut.getState());
	}

	@Test
	public void testAddToZero(){
		Calculator sut = new Calculator();
		sut.setState(0);
		sut.add(100);
		assertEquals("0+100 = 100", 100, sut.getState());
	}

	@Test
	public void testIntegerRangeExceedAdd(){
		Calculator sut = new Calculator();
		sut.setState(2147483647);
		sut.add(2);
		assertEquals("2147483647 + 1 = 0",0, 0);
	}

	@Test
	public void testIntegerRangeExceedMult(){
		Calculator sut = new Calculator();
		sut.setState(2147483647);
		sut.mult(2);
		assertEquals("2147483647 * 2 = 0",0, 0);
	}


	@Test
	public void testMultPositiveNumbers(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.mult(2);
		assertEquals("1*2 = 2", 2, sut.getState());
		sut.mult(3);
		assertEquals("2*3 = 6", 6, sut.getState());
	}

	@Test
	public void testMultiNegativeNumbers(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.mult(-2);
		assertEquals("1*(-2) = -2", -2, sut.getState());
		sut.mult(-3);
		assertEquals("(-2)*(-3) = 6", 6, sut.getState());
	}

	@Test
	public void testSubPositiveNumbers(){
		Calculator sut = new Calculator();
		sut.setState(5);
		sut.sub(1);
		assertEquals("5 - 1 = 4", 4, sut.getState());
		sut.sub(10);
		assertEquals("4 - 10 = -6", -6, sut.getState());
	}

	@Test
	public void testSubNegativeNumbers(){
		Calculator sut = new Calculator();
		sut.setState(5);
		sut.sub(-1);
		assertEquals("5 - (-1) = 6", 6, sut.getState());
		sut.sub(-10);
		assertEquals("6 - (-10) = 16", 16, sut.getState());
	}

	@Test
	public void testSubFromZero(){
		Calculator sut = new Calculator();
		sut.setState(0);
		sut.sub(100);
		assertEquals("0 - 100 = -100", -100, sut.getState());
	}

	@Test
	public void testIntegerRangeExceedSub(){
		Calculator sut = new Calculator();
		sut.setState(-2147483647);
		sut.sub(1);
		assertEquals("-2147483647 - 1 = 0",0, 0);
	}
	@Test
	public void testDivByPositiveNumbers(){
		Calculator sut = new Calculator();
		sut.setState(6);
		sut.div(2);
		assertEquals("6/2 = 3", 3, sut.getState());
		sut.div(3);
		assertEquals("3/3 = 1", 1, sut.getState());
	}

	@Test
	public void testDivByNegativeNumbers(){
		Calculator sut = new Calculator();
		sut.setState(6);
		sut.div(-2);
		assertEquals("6/-2 = -3", -3, sut.getState());
		sut.div(-3);
		assertEquals("-3/-3 = -1", 1, sut.getState());
	}

	@Test
	public void testZeroByNumber(){
		Calculator sut = new Calculator();
		sut.div(2);
		assertEquals("0/2 = 0", 0, sut.getState());
		sut.div(-3);
		assertEquals("0/-3 = 0", 0, sut.getState());
	}

	@Test
	public void testDivByZero(){
		Calculator sut = new Calculator();
		sut.setState(2);
		sut.div(0);
		assertEquals("2/0 = 2", 0, sut.getState());
	}

	@Test
	public void testStoreInMemory(){
		Calculator sut = new Calculator();
		sut.setState(4);
		sut.storeInMemory();
		assertEquals(4, sut.getMemory());
	}

	@Test
	public void testStoreInMemoryAfterOperations(){
		Calculator sut = new Calculator();
		sut.setState(4);
		sut.add(2);
		sut.storeInMemory();
		assertEquals(6, sut.getMemory());
	}

	@Test
	public void testAddFromMemory(){
		Calculator sut = new Calculator();
		sut.setState(4);
		sut.storeInMemory();
		sut.setState(2);
		sut.addFromMemory();
		assertEquals(6, sut.getState());
	}

	@Test
	public void testSubFromMemory(){
		Calculator sut = new Calculator();
		sut.setState(2);
		sut.storeInMemory();
		sut.setState(6);
		sut.subFromMemory();
		assertEquals(4, sut.getState());
	}

	@Test
	public void testDivFromMemory(){
		Calculator sut = new Calculator();
		sut.setState(2);
		sut.storeInMemory();
		sut.setState(6);
		sut.divFromMemory();
		assertEquals(3, sut.getState());
	}

	@Test
	public void testMultFromMemory(){
		Calculator sut = new Calculator();
		sut.setState(2);
		sut.storeInMemory();
		sut.setState(6);
		sut.multFromMemory();
		assertEquals(12, sut.getState());
	}

	@Test
	public void testClearMemoryMemory(){
		Calculator sut = new Calculator();
		sut.setState(2);
		sut.storeInMemory();
		sut.clearMemory();
		assertEquals(0, sut.getMemory());
	}
}


