package demoStingOperationPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Program to find the duplicates in a string
public class StringOperation1 {

	public static void main(String[] args) {
//		String str ="Welcometoindia";
//		char characters [] = str.toCharArray();
//		Map<Character,Integer> map = new HashMap<Character, Integer>();
//		for(Character ch:characters ) {
//			if(map.containsKey(ch)) {
//				map.put(ch, map.get(ch)+1);
//			}
//			else {
//				map.put(ch, 1);
//			}
//			Set<Map.Entry<Character,Integer>> mapentry= map.entrySet();
//			for(Map.Entry<Character, Integer> m: mapentry) {
//				if(m.getValue()>1) {
//					System.out.println(m.getKey()+" : "+m.getValue()+" times");
//				}
//			}
//		}
		String word ="Welcome to india";
		char[] characters = word.toCharArray();  
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>(); 
		for (Character ch : characters) { 
			if (charMap.containsKey(ch)) { 
				charMap.put(ch, charMap.get(ch) + 1); 
				} else { 
					charMap.put(ch, 1); 
					} 
			} 
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet(); 
			System.out.printf("List of duplicate characters in String '%s' %n", word); 
			for (Map.Entry<Character, Integer> entry : entrySet) { 
				if (entry.getValue() > 1) { 
					System.out.println(entry.getKey()+":"+ entry.getValue()); 
					} 
				} 
			for (Map.Entry<Character, Integer> entry : entrySet) { 
				if (entry.getValue() == 1) { 
					System.out.println("NOnrepeated characters:"+entry.getKey()); 
					} 
				} 
	}

}
