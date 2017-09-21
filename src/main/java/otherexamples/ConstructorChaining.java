package otherexamples;

class Base {
	String name;

	Base() {
		this("hello");
		System.out.println("No-argument constructor of" + " base class");
	}

	Base(String name) {
		this.name = name;
		System.out.println("Calling parameterized constructor" + " of base");
	}
}

public class ConstructorChaining extends Base {
	ConstructorChaining() {
		System.out.println("No-argument constructor " + "of derived");
	}

	ConstructorChaining(String name) {
		super(name);
		System.out.println("Calling parameterized " + "constructor of derived");
	}

	public static void main(String args[]) {
		ConstructorChaining obj = new ConstructorChaining("test");

	}
}