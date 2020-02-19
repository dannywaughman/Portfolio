package com.qa.oddity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddityRunner {

	public static void main(String[] args) {

		int[] teens = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };

		System.out.println(oddity(teens));

	}

	public static List<Integer> oddity(int[] nums) {

		return Arrays.stream(nums).boxed().filter(num -> num % 2 == 1).collect(Collectors.toList());

	}
}
