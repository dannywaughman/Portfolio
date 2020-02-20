package com.qa.fizzbuzz;

public class FizzBuzzSnapPop {

	public static void main(String[] args) {

		System.out.println(fizzBuzzSnapPop(33));

	}

	public static String fizzBuzzSnapPop(int num) {

		String string = "";
		if (num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num % 11 == 0) {
			if (num % 3 == 0) {
				string += "Fizz";
			}
			if (num % 5 == 0) {
				string += "Buzz";
			}
			if (num % 7 == 0) {
				string += "Snap";
			}
			if (num % 11 == 0) {
				string += "Pop";
			}
		} else {
			return String.valueOf(num); 
		}
		return string;

	}

}
