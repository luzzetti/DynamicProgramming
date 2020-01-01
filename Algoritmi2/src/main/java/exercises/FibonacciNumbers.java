package exercises;

import java.util.Arrays;

import utilities.Cronometro;

/*
 * Program for Fibonacci numbers
 * The Fibonacci numbers are the numbers in the following integer sequence.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
 * 
 * In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation
 * Fn = Fn-1 + Fn-2
 * 
 */
public class FibonacciNumbers {

	private static final int MAX = 40;
	private static final Integer[] fibonacci = new Integer[MAX];

	public static void main(String[] args) {
		Cronometro cro = new Cronometro();

		Arrays.fill(fibonacci, -1);
		cro.start();
		bottomUp();
		cro.end();
		System.out.println(Arrays.asList(fibonacci));

		Arrays.fill(fibonacci, -1);
		cro.start();
		topDown(MAX - 1);
		cro.end();
		System.out.println(Arrays.asList(fibonacci));

	}

	private static int topDown(int n) {

		// Se non c'è, lo calcolo
		if (fibonacci[n] == -1) {
			if (n <= 1) {
				fibonacci[n] = n;
			} else {
				fibonacci[n] = topDown(n - 1) + topDown(n - 2);
			}
		}

		// Poi lo ritorno
		return fibonacci[n];
	}

	private static void bottomUp() {
		System.out.println("BottomUp: ");

		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (int i = 2; i < MAX; i++)
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

	}

}
