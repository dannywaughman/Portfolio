package com.qa.fibonaccirecursion;

public class Fib {

	public static void main(String[] args) {

		System.out.println(fibRec(6));

	}

	public static int fibRec(int num) {

		if (num == 0 || num == 1) {
			return num;
		}

		return fibRec(num - 1) + fibRec(num - 2);

	}

}
