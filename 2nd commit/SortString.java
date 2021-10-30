package com.exercise2.java;

import java.util.Arrays;

public class SortString {
public static void main(String[] args) {
		
		String [] stringArray = {"ab", "Ba", "c", "Sub", "2", "1Ad", "a10"};
	    sortString(stringArray);

	}

	public static void sortString(String[] sArr)
	{
	    Arrays.sort(sArr);
	    for(String result:sArr) {
	    System.out.print(result+" ");
	    }
	}
}
