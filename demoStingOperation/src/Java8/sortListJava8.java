package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import demoStingOperationPrograms.Condition;
import demoStingOperationPrograms.Person;

public class sortListJava8 {

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
		
		Collections.sort(people , (p1,p2) -> p1.getLastName().compareToIgnoreCase(p2.getLastName()) );
		
		//Step 2: create method to print sorted list
		printConditionally(people, p-> true);
		System.out.println();
		
	    //Step 3: create method to print list where person First name starting with K
		printConditionally(people, t -> t.getLastName().startsWith("K"));
		System.out.println();
		printConditionally(people, t -> t.getFirstName().startsWith("F"));
		System.out.println();
		
	}

//	private static void printAll(List<Person> people) {
//		for(Person person:people) {
//			System.out.println(person);
//		}
//	}
	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}


}
