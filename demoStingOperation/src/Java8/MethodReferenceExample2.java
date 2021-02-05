package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import demoStingOperationPrograms.Person;

public class MethodReferenceExample2 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Fatha","Qureshi",20),
				new Person("Sadiya","Husaini",15),
				new Person("Mohamed","Kashif",10),
				new Person("noor","Khuresh",10),
				new Person("tom","Queryy",10),
				new Person("jackey","Quor",10)
				);

		//printConditionally(people, p -> true,t-> System.out.println(t));
		// taking one input argument and passing it in --> it wil get to knw because we are using consumer. 
		 // and Consumer needs one argument
		printConditionally(people, p -> true,System.out::println);
		System.out.println();
		
		
	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
