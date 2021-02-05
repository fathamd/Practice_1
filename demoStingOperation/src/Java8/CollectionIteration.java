package Java8;

import java.util.Arrays;
import java.util.List;

import demoStingOperationPrograms.Person;

public class CollectionIteration {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Fatha","Qureshi",20),
				new Person("Sadiya","Husaini",15),
				new Person("Mohamed","Kashif",10),
				new Person("noor","Khuresh",80),
				new Person("tom","Queryy",50),
				new Person("Mohamed","kuresh",15)
				);
		
		people.forEach(p-> System.out.println(p));
		System.out.println();
		//using method reference --> one argument is passed so its Consumer Functional Interface
		System.out.println("using method reference");
		people.forEach(System.out::println); 
	}

}
