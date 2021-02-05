package demoStingOperationPrograms;

import java.util.HashSet;
import java.util.Iterator;

// add and iterate set
public class StringOperation8 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("hello");
		set.add("hi");
		set.add("welcome");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
