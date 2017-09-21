package nestedclassesdemo;

//OUTER CLASS
public class OuterClassWithLocalInnerClass {

	public OuterClassWithLocalInnerClass(int a, int b) {
		this.a = a;
		this.b = b;
	}

	private int a;
	private int b;
	private final int c = 4;
	private static int d = 5;

	static int staticMethod() {
		return 1;
	}

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

	void methodWithLocalInnerClass() {
		// Hidden from the outside world
		final int localA = 1;
		final int localB = 3;
		int effectiveFinalVar = 5;

		// LOCAL INNER CLASS
		class InnerClass { //non-static as it can access the variables of enclosing block

			private void display() {
				System.out.println(a); // can access variable of OuterClass even
										// if its private
				printA(); // can access directly
				printB();

				System.out.println(c); // can access final variables
				System.out.println(d); // can access static variables

				staticMethod(); // can access even static method of outerclass

				System.out.println(localA); // only possible if its final or
											// effectively final
				System.out.println(localB);
				System.out.println(effectiveFinalVar); // effectively final
			}
		}

		InnerClass ic = new InnerClass();
		ic.display();
	}

	void printA() {
		System.out.println("a : " + a);
	}

	void printB() {
		System.out.println("b : " + b);
	}

	public static void main(String[] args) {
		OuterClassWithLocalInnerClass oc = new OuterClassWithLocalInnerClass(3, 8);
		// OuterClass.InnerClass ic = oc.new InnerClass(); -> cannot create
		// object even with Outer class object

		// Cannot create object of InnerClass here!!!
		oc.methodWithLocalInnerClass();

	}
}
