import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class FibTest {

	@Test
	void testNumbersInFibonacciSequence() {
		Fibonacci fib = new Fibonacci();
		BigInteger[] values = new BigInteger[100];

		assertEquals(fib.fib(50, values), new BigInteger("12586269025"));
		assertEquals(fib.fib(10, values), new BigInteger("55"));
		assertEquals(fib.fib(6, values), new BigInteger("8"));
		assertEquals(fib.fib(5, values), new BigInteger("5"));
		assertEquals(fib.fib(4, values), new BigInteger("3"));
		assertEquals(fib.fib(2, values), new BigInteger("1"));
		
	}


}