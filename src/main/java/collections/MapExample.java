package collections;

import java.util.Map;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		Map<Person, String> map = new TreeMap<>();
		map.put(new Person("Ramesh", 10), "Ten");

		map.put(new Person("Suresh", 6), "Six");
		map.put(new Person("Ram", 3), "Three");
		map.put(new Person("Rajesh", 8), "Eight");
		for (Person person : map.keySet()) {
			System.out.println("key:=" + person.getName() + " value: " + map.get(person));
		}
	}
}
