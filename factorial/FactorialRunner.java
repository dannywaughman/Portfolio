package com.qa.factorial;

public class FactorialRunner {

	public static void main(String[] args) {

		System.out.println("5! = " + Factorial(5));

		System.out.println("6! = " + Factorial(6));

	}

	public static int Factorial(int i) {

		int a = i - 1;

		while (a >= 1) {
			i = i * a;
			a--;
		}
		return i;
	}

}
