package com.lab6.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 8, 9 };
		Sorting.getSorted(arr);
	}

	public static void getSorted(int[] arr) {
		List<Character> list = new ArrayList<>();
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str = arr[i] + str;
		}

		for (char ch : str.toCharArray()) {
			list.add(ch);
		}

		Collections.sort(list);
		System.out.println(list);

	}
}
