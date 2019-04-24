import java.util.Scanner;

public class FibRun {

	/*
	 * Main method that prints the first x amount of numbers within a fibonacci sequence
	 * based on user input. 
	 * Instructions on running the program can be found in the readme file.
	 */
	public static void main(String[] args) {
		
		Fibonacci fib = new Fibonacci();
		
		System.out.println("Enter input");
		
		// Scanner to get the input value from user
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		// Call to the fibonacciRunner method which will print out x amount of numbers 
		// within a fibonacci sequence
		fib.fibonacciRunner(input);

		System.exit(0);
	}
}