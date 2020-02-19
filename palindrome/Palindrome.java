package com.qa.palindrome;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println(palindrome("RaceCar"));

		System.out.println(palindrome("Not palindrome"));

	}

	public static boolean palindrome(String sentence) {

		sentence = sentence.replace(" ", "").toLowerCase();

		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(sentence);

		stringBuilder.reverse();

		return sentence.equals(stringBuilder.toString());

	}

}
