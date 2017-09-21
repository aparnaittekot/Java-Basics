package collections;

public class Person implements Comparable<Person> {
	private String name;
	private Integer age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (p.getName().equals(this.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Person o) {
		return this.age.compareTo(o.getAge());
	}
}
