package com.qa.indexof;

public class IndexOf {

	public static void main(String[] args) {

		System.out.println(indexOf('h', "Hello"));
		System.out.println(indexOf('e', "Hello"));

	}

	public static int indexOf(char c, String sentence) {

		for (int i = 0; i < sentence.length(); i++) {

			if (c == sentence.toLowerCase().toCharArray()[i]) {
				return i;
			}

		}
		return -1;
	}

}
