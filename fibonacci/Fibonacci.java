package com.qa.fibonacci;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println(fibonacciSequence(7));
		;

	}

	public static int fibonacciSequence(int pos) {

		if (pos == 0 || pos == 1) {
			return pos;
		}

		int a = 0;
		int b = 1;
		int c = 0;

		for (int i = 2; i <= pos; i++) {

			c = a + b;
			a = b;
			b = c;

		}
		return c;

	}

}
