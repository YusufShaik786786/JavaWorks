package com.lab6.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentDetails {

	public static void main(String[] args) {

		HashMap<String, Integer> hmap = new HashMap<>();
		hmap.put("yuvaraj10", 50);
		hmap.put("sachin20", 87);
		hmap.put("dhoni30", 100);
		hmap.put("gambhir40", 98);
		hmap.put("pant50", 76);
		hmap.put("samson60", 87);
		Map<String, String> result = getStudents(hmap);
		System.out.println(result);
	}

	public static Map<String, String> getStudents(Map<String, Integer> inMap) {

		HashMap<String, String> outMap = new HashMap<String, String>();

		for (Entry<String, Integer> entry : inMap.entrySet()) {

			if (entry.getValue() >= 90) {
				outMap.put(entry.getKey(), "Gold");
			}

			else if (entry.getValue() >= 80 && entry.getValue() < 90) {
				outMap.put(entry.getKey(), "Silver");
			} else if (entry.getValue() >= 70 && entry.getValue() < 80) {
				outMap.put(entry.getKey(), "Bronze");
			}

		}

		return outMap;
	}

}
