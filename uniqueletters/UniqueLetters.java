package com.qa.uniqueletters;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UniqueLetters {

	public static void main(String[] args) {

		System.out.println(uniqueLetters("Daniel Waughman"));

		System.out.println(uniqueLetters("abcdefghijklmnopqrstuvwxyz"));

	}

	public static String uniqueLetters(String sentence) {

		return Arrays.asList(sentence.split("")).stream().distinct().collect(Collectors.joining(""));

	}

}
