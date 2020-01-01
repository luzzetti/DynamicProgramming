package exercises;

import java.util.Arrays;

import utilities.Cronometro;

public class UglyNumbers {
	/*
	 * Ugly Numbers Ugly numbers are numbers whose only prime factors are 2, 3 or 5.
	 * The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly
	 * numbers. By convention, 1 is included.
	 * 
	 * Given a number n, the task is to find n’th Ugly number.
	 */

	private static final int NTH = 150;
	private static final int MAX = NTH * 1000;

	private static final Integer[] ugly = new Integer[MAX];

	public static void main(String[] args) {
		Cronometro cro = new Cronometro();

		Arrays.fill(ugly, -1);
		cro.start();
		System.out.println("Soluzione: " + bottomUp());
		cro.end();
//		System.out.println(Arrays.asList(ugly));

//		Arrays.fill(ugly, -1);
//		cro.start();
//		topDown(MAX - 1);
//		cro.end();
//		System.out.println(Arrays.asList(ugly));

	}

	private static void topDown(int i) {
		// TODO Auto-generated method stub
	}

	private static int bottomUp() {

		int uglyCounter = 1;
		ugly[1] = 1;
		int i=2;
		while (true) {
						
			if (i % 2 == 0) {
				if (ugly[i/2] > 0) {
					ugly[i] = ugly[i/2]*2;
					uglyCounter++;
				}
			} else if (i % 3 == 0) {
				if (ugly[i/3] > 0) {
					ugly[i] = ugly[i/3]*3;
					uglyCounter++;
				}
			} else if (i%5 ==0) {
				if (ugly[i/5] > 0) {
					ugly[i] = ugly[i/5]*5;
					uglyCounter++;
				}
			}
			
			if (uglyCounter == NTH) {
				return ugly[i];
			}
			i++;
		}
	}

}
