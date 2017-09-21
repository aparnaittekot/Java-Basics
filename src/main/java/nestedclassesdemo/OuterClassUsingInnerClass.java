package nestedclassesdemo;

//non static nested class example
public final class OuterClassUsingInnerClass {
	
	public OuterClassUsingInnerClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	private int a;
	private int b;
	private final int c = 4;
	private static int d  = 5;

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

	void printA() {
		System.out.println("a : " + a);
	}

	void printB() {
		System.out.println("b : " + b);
	}

	//Hidden from the outside world
	class InnerClass {

		void display() {
			System.out.println(a); // can access vari=able of OuterClass even if its private
			System.out.println(c); // can access final variables
			System.out.println(d); // can access static variables
			printA(); //can access directly
			printB();
		}
	}

	public static void main(String[] args) {
		OuterClassUsingInnerClass oc = new OuterClassUsingInnerClass(1, 3);
		
		//Cannot create object of InnerClass without creating object of OuterClass
		OuterClassUsingInnerClass.InnerClass ic = oc.new InnerClass();
		ic.display();
	}
}
