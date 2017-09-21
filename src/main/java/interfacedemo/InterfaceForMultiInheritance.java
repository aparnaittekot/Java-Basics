package interfacedemo;

interface example1 {
	void methodA();
}

interface example2 {
	void methodB();
}

interface example3 {
	void methodC();
}

public class InterfaceForMultiInheritance implements example1, example2, example3 {

	public static void main(String[] args) {
		InterfaceForMultiInheritance iMI = new InterfaceForMultiInheritance();

		iMI.methodA();
		iMI.methodB();
		iMI.methodC();
	}

	public void methodC() {
		System.out.println("inside methodC() ");
	}

	public void methodB() {
		System.out.println("inside methodB() ");
	}

	public void methodA() {
		System.out.println("inside methodA() ");
	}
}
