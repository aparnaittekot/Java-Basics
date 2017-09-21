package nestedclassesdemo;

//Java program to demonstrate need of Anonymous Inner class
interface Age2 {

	int x = 21;

	void getAge();
}

public class BeforeUsingAnonymousClassPart2 {
	public static void main(String[] args) {

		// Myclass is implementation class of Age interface
		BeforeUsingAnonymousClassPart2 obj = new BeforeUsingAnonymousClassPart2();

		// calling getage() method implemented at Myclass
		BeforeUsingAnonymousClassPart2.MyClass sample = obj.new MyClass();
		sample.getAge();
	}

	// Myclass implement the methods of Age Interface
	class MyClass implements Age2 {

		@Override
		public void getAge() {
			// printing the age
			System.out.print("Age is " + x);
		}
	}
}
