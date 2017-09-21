package nestedclassesdemo;

public class OuterClassUsingStaticInnerClass {
	
	private OuterClassUsingStaticInnerClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void printA() {
		System.out.println("a : " + a);
	}

	public void printB() {
		System.out.println("b : " + b);
	}
	
	class newInnerClass {}
	
	static void method() {
		StaticInnerClass innerClas = new StaticInnerClass(); // can create an instance of static nested class
		
		//Can I access newInnerClass class here??????
	}
	
	//OUTER CLASS
	// Hidden from the outside world
	static class StaticInnerClass {

		private void display() {
			OuterClassUsingStaticInnerClass outerClass1 = new OuterClassUsingStaticInnerClass(3, 4);
			outerClass1.getA();
			// System.out.println(a); // cannot access any variables or methods of OuterClass
										// even if its public
			// printA(); //cannot access directly
			// printB();
		}
	}
	
	static class StaticInnerClass1 {

		private void display() {
			OuterClassUsingStaticInnerClass outerClass1 = new OuterClassUsingStaticInnerClass(3, 4);
			outerClass1.getA();
			// System.out.println(a); // cannot access any variables or methods of OuterClass
										// even if its public
			// printA(); //cannot access directly
			// printB();
		}
	}

	public static void main(String[] args) {

		// Syntax for creating object of StaticInnerClass
		OuterClassUsingStaticInnerClass.StaticInnerClass1 ic = new OuterClassUsingStaticInnerClass.StaticInnerClass1();
		ic.display();

		// can create without the use of object of OuterClass1
		// why we can create an instance of static nested class??????
		StaticInnerClass sc = new StaticInnerClass();
		sc.display();

	}
}
