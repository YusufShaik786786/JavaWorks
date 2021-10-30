package com.lab6.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapElements {

	public static void main(String[] args) {

		HashMap<String, Integer> hMap = new HashMap<>();
		hMap.put("Gambhir", 60);
		hMap.put("Kohli", 56);
		hMap.put("Dhoni", 65);
		hMap.put("SanjuSamson", 70);

		
		getValue(hMap);

	}

	public static List getValue(HashMap<String, Integer> hMap) {

		
		Map<String, Integer> map = hMap;

		// display all the key value pair
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() +"::"+ " Value: " + entry.getValue());
		}
		System.out.println(map.values());

		System.out.println();
		List<Integer> list = new ArrayList<>(map.values());
		System.out.println("Before Sorting::");
		for (Integer ele : list)
			System.out.print(ele);

		//Sorting the list elements with the help of collection class
		Collections.sort(list);

		System.out.println();
		System.out.println("After Sorting::");
		for (Integer ele : list) {
			System.out.print(ele);
		}

		return list;
	
	}

}
