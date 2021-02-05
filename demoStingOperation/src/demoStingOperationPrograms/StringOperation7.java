package demoStingOperationPrograms;

import java.util.ArrayList;
import java.util.Iterator;

// Add and iterate List
public class StringOperation7 {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		str.add("FAtha");
		str.add("MOhamed");
		str.add("Qureshi");
		Iterator it = str.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
