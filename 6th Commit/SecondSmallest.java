package com.lab6.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondSmallest {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, 0, 3, 8, 8, 9, 0 };
		System.out.println("Second Smallest Is::" + getSecondSmallest(arr));

	}

	public static int getSecondSmallest(int[] arr) {
		List<Integer> l = new ArrayList<>();
		int i;
		for (i = 0; i < arr.length; i++) {

			int add = arr[i];
			l.add(add);

		}
		Collections.sort(l);
		int res = 0;
		for (int j = 0; j < l.size() - 1; j++) {
			if (l.get(j) != l.get(j + 1)) {
				res = l.get(j + 1);
				break;
			} else {
				continue;
			}
		}
		return res;

	}
}
