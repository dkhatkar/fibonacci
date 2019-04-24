import java.math.BigInteger;

public class Fibonacci {
	
	/*
	 * fibonacciRunner method that drives our program from the main java method.
	 * Takes input as an argument. This is value provided by the scanner in the main method.
	 */
	public void fibonacciRunner(int input) {
	
		// Validate that the value is greater than 0. 0 is an acceptable value. Error if it is not.
		if(input < 0) {
			System.out.println("Invalid Input");
			return;
		}
		BigInteger[] values = new BigInteger[input + 1];
		for(int i = 0; i <= input; i++) {
			System.out.println(fib(i, values));
		}

	}
	
	/*
	 * fib method that takes input and array of BigInteger values as arguments.
	 * input is the current fibonacci number we are trying to find in the sequence
	 * values holds all the fibonacci numbers that we have found so far.
	 * The values array is used so we don't have to calculate and perform recursion multiple times.
	 * We can simply access the value if it already exists, saving time.
	 * 
	 * BigInteger must be used because the number may exceed the largest possible value for a long data type.
	 */
	public BigInteger fib(int input, BigInteger[] values) {

		// base cases for recursion. Values that do not need any more recursive calls.
		if(input == 0) {
			return BigInteger.ZERO;
		}
		else if(input == 1) {
			return BigInteger.ONE;
		}
		
		// Checking the values array to see if the current fibonacci nubmer we are trying to find
		// has already been set. The check is done based on the default value of BigInteger (null).
		// If the value of the current fibonacci number has not been set, recursion is performed to get
		// the value of the current fibonacci number.
		if(values[input] == null) {
			values[input] =  fib(input - 1, values).add(fib(input - 2, values));
		}
		
		// Return the newly stored value for the current fibonacci number (input)
		return values[input];

	}

}
