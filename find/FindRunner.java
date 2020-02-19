package com.qa.find;

public class FindRunner {

	public static void main(String[] args) {

		System.out.println("Is the fourth letter of Danny n? " + FindChar("Danny", 3, 'n'));

	}

	public static boolean FindChar(String sentence, int num, char character) {

		return sentence.substring(num - 1, num).equals(String.valueOf(character));

	}

}
