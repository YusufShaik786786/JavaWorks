package com.lab6.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class VoterChecking {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1000, 10);
		map.put(1001, 38);
		map.put(1002, 39);
		map.put(1003, 24);
		List<Integer> li = votersList(map);
		System.out.print("Eligible Voters ID's List Is============>");
		System.out.println(li);

	}

	private static List<Integer> votersList(Map<Integer, Integer> map) {
		List<Integer> li = new ArrayList<>();
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 18) {
				li.add(entry.getKey());
			}
		}
		return li;
	}
}
