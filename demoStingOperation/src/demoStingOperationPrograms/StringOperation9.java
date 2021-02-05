package demoStingOperationPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


//Add and iterate map
public class StringOperation9 {
	final static int x;
	static {
		x=20;
		System.out.println("static block");
	}

	public static void main(String[] args) {
//		HashMap<Integer, String> map= new LinkedHashMap<Integer, String>();
//		map.put(1, "Fatha");
//		map.put(4, "qureshi");
//		map.put(2, "sadiya");
//		
//		Set<Map.Entry<Integer,String>> s = map.entrySet();
//		for(Map.Entry<Integer, String> me : s) {
//			System.out.println(me.getKey() +" "+me.getValue());
//		}
//		System.out.println(map.get(4));
		System.out.println(StringOperation9.x);
	}

}
