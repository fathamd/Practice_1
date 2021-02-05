package Java8;

import java.util.Arrays;
import java.util.List;

import demoStingOperationPrograms.Person;

public class StreamsExample1 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Fatha","Qureshi",20),
				new Person("Sadiya","Husaini",15),
				new Person("Mohamed","Kashif",10),
				new Person("noor","Khuresh",80),
				new Person("tom","Queryy",50),
				new Person("Mohamed","kuresh",15)
				);
		people.stream().filter(n -> n.getLastName().startsWith("K")).forEach(n -> System.out.println(n.getFirstName()));
		people.parallelStream().filter(n -> n.getLastName().startsWith("K")).forEach(n -> System.out.println(n.getFirstName()));
		Long c =people.stream().filter(n -> n.getLastName().startsWith("K")).count();
		System.out.println(c);
	}

}
