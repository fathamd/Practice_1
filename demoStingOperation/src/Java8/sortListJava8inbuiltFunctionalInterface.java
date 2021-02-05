package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import demoStingOperationPrograms.Person;

public class sortListJava8inbuiltFunctionalInterface {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Fatha","Qureshi",20),
				new Person("Sadiya","Husaini",15),
				new Person("Mohamed","Kashif",10),
				new Person("noor","Khuresh",10),
				new Person("tom","Queryy",10),
				new Person("jackey","Quor",10)
				);
		int arr[] = {1,2,3,4,5,6};
		int key = 2;
		// Step 1: Sort the list by last name
		
		Collections.sort(people , (p1,p2) -> p1.getLastName().compareToIgnoreCase(p2.getLastName()) );
		
		//Step 2: create method to print sorted list using Consumer
		printConditionally(people, p-> true, p-> System.out.println(p));
		System.out.println();
		
	    //Step 3: create method to print list where person First name starting with K
		printConditionally(people, t -> t.getLastName().startsWith("K"),t-> System.out.println(t));
		System.out.println();
		printConditionally(people, t -> t.getFirstName().startsWith("F"),t-> System.out.println(t));
		System.out.println();
		
		// add key to all the array using BiConsumer 
		addarray(arr, key, (v,k)-> System.out.println(v+k));
		
	}


	private static void addarray(int[] arr, int key, BiConsumer<Integer,Integer> object) {
		for(Integer i: arr) {
			object.accept(i, key);
		}
	}


	private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}
