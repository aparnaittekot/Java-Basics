package interfacedemo;

interface Pritable {
	void sysout();

	void displayName();
}

class Parent implements Pritable {

	public void displayName() {
		System.out.println("This is Parent Name");
	}

	public void sysout() {
		System.out.println("I am Printable Interfacein Parent Class");
	}
}

public class InterfaceAsReferenceVariable {
	public static void main(String[] args) {

		Pritable objParent = new Parent();

		objParent.sysout();
		objParent.displayName();
	}
}
