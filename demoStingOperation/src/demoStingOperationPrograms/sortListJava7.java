package demoStingOperationPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class sortListJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Fatha","Qureshi",20),
				new Person("Sadiya","Husaini",15),
				new Person("Mohamed","Kashif",10),
				new Person("noor","Khuresh",10),
				new Person("tom","Queryy",10),
				new Person("jackey","Quor",10)
				);
		
	// Step 1: Sort the list by last name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
	//Step 2: create method to print sorted list
		printAll(people);
		System.out.println();
		
    //Step 3: create method to print list where person First name starting with K
		printlastnamewithK(people);
		
		System.out.println();
		
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("Q");
			}
			
		});
		
	}

	private static void printlastnamewithK(List<Person> people) {
		for (Person p : people) {
			if (p.getLastName().startsWith("K")) {
			System.out.println(p);
			}
		}

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for(Person p: people) {
				System.out.println(p);
		}
		
	}

}

