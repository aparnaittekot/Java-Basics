package nestedclassesdemo;

//Java program to demonstrate need of Anonymous Inner class
interface Age {

	int x = 21;

	void getAge();
}

public class AfterUsingAnonymousInnerClassExample {
	public static void main(String[] args) {

		Age age = new Age() { // Sample class is hidden here!!!!!! 
			@Override
			public void getAge() {
				System.out.print("Age is " + x);
			}
		};
		
		age.getAge();
	}
}