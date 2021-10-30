package com.lab6.com;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c', 'd', 'g', 'a', 'b', 'c', 'd', 'g','a', 'b', 'c', 'd', 'g', 'a', 'b', 'c', 'd', 'g' };
		Map<Character,Integer> map=CharCount.countChar(ch);
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
		 System.out.println("Character is"+"::"+entry.getKey()+"----"+"repeated as"+"::"+entry.getValue());
		}
	}

	public static Map<Character,Integer> countChar(char[] ch) {

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			char put = ch[i];

			if (map.containsKey(put)) {
				map.put(put, map.get(put) + 1);
			} else {
				map.put(put, 1);
			}

		}
		return map;
		
		
		
	}
}
