package com.qa.primenumbers;

public class PrimeNumbers {

	public static void main(String[] args) {

		System.out.println(primeNumbers(10));
		System.out.println(primeNumbers(100));

	}

	public static int primeNumbers(int maxNum) {

		int count = 0;
		int factorialCount;

		for (int i = 0; i <= maxNum; i++) {

			factorialCount = 0;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					factorialCount++;
				}

			}
			if (factorialCount == 2) {
				count++;
			}
		}
		return count;
	}

}
