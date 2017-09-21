package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Rajesh", 24));
		list.add(new Person("Ramesh", 25));
		list.add(new Person("Suresh", 30));

		Iterator<Person> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next().getName());
		}

		for (Person person : list) {
			System.out.println(person.getAge());
		}
	}
}
