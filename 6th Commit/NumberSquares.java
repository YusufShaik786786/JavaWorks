package com.lab6.com;

import java.util.HashMap;
import java.util.Map;

public class NumberSquares {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Map<Integer, Integer> map = getSquares(arr);
		for (Map.Entry entryset : map.entrySet()) {
			System.out.println("Sauare of" + entryset.getKey() + "::" + "----is--->" + entryset.getValue());

		}

	}

	public static Map<Integer, Integer> getSquares(int[] arr) {
		Map<Integer, Integer> map = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			map.put(num, num * num);

		}
		return map;
	}

}
