package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Collection<Person> personSet = new TreeSet<>();
		personSet.add(new Person("Rajesh", 23));
		personSet.add(new Person("Ramesh", 22));
		personSet.add(new Person("Suresh", 25));
		personSet.add(new Person("Rajesh", 26));
		personSet.add(new Person("Ramesh", 27));
		personSet.add(new Person("Suresh", 25));

		System.out.println(personSet.size());
		Iterator<Person> itr = personSet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next().getName());
		}

		for (Person person : personSet) {
			System.out.println(person.getAge());
		}

		List<Person> personSet1 = new ArrayList<>();
		personSet1.addAll(personSet);
		Collections.sort(personSet1, new NameComprator());
		Iterator<Person> itr1 = personSet1.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next().getName());
		}

		for (Person person : personSet1) {
			System.out.println(person.getAge());
		}
	}
}
