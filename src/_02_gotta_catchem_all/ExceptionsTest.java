package _02_gotta_catchem_all;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ExceptionsTest {
	ExceptionMethods em = new ExceptionMethods();
	
	//1. This is an example of how one might test that an exception is thrown.
	//   It tests that an IndexOutOfBoundsException is thrown 
	@Test
	public void testIndexOOBException() {
		int[] vars = {0, 1, 2, 3};
			
		try {
			vars[0] = 4;
			assertArrayEquals(vars, new int[] {4, 1, 2, 3});
			vars[4] = 5;
			fail("IndexOutOfBoundsException not thrown");
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			assertArrayEquals(vars, new int[] {4, 1, 2, 3});
		}
	}
	
	//2. In the ExceptionMethods class, write a method called divide that takes
	//   two doubles as parameters and returns their quotient as a double. This method 
	//   should throw an IllegalArgumentException if the denominator is 0.0.
	
	//3. Complete the JUnit test method to test the divide method.
	@Test
	public void testDivideByZeroException() {
		System.out.println("test Divide by 0");
		double first = 7.8;
		double second = 0.0;
		double third = 5.2;
		double y = 0.0;
		ExceptionMethods runner = new ExceptionMethods();
		try {
			y = runner.divide(first, third);
			assertEquals(y,first/third);
			double q = runner.divide(first,second);
			System.out.println(q);
			fail("IllegalArgumentException not thrown");
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
			assertEquals(y,first/third);
		}
	}
	
	//4. In the ExceptionMethods class, write a method called reverseString that takes a
	//   String and returns the reverse of that String. It should throw an IllegalStateException
	//   if the String passed in is empty
	
	//5. Complete the JUnit test method to test the reverseStringMethod.
	@Test
	public void testReverseString() {
		ExceptionMethods runner = new ExceptionMethods();
		System.out.println("testing reverse string");
		try {
			runner.reverseString("WHy");
			runner.reverseString("");
			fail("IllegalArgumentException not thrown");
		}catch(IllegalStateException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
