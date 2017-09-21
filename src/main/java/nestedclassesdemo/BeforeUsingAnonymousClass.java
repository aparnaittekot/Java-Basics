package nestedclassesdemo;

//Java program to demonstrate need of Anonymous Inner class
interface Age1 {

	int x = 21;

	void getAge();
}

public class BeforeUsingAnonymousClass {
	public static void main(String[] args) {

		// Myclass is implementation class of Age interface
		MyClass obj = new MyClass();

		// calling getage() method implemented at Myclass
		obj.getAge();
	}
}

// Myclass implement the methods of Age Interface
class MyClass implements Age1 {

	@Override
	public void getAge() {
		// printing the age
		System.out.print("Age is " + x);
	}
}