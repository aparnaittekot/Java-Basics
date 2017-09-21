package otherexamples;

class BaseClass {
	public void methodToOverride() // Base class method
	{
		System.out.println("I'm the method of BaseClass");
	}
}

class DerivedClass extends BaseClass {
	
	public void methodToOverride() // Derived Class method
	{
		System.out.println("I'm the method of DerivedClass");
	}
}

public class OverridingExample {
	public static void main(String args[]) {
		BaseClass obj1 = new BaseClass();
		BaseClass obj2 = new DerivedClass();

		obj1.methodToOverride();
		obj2.methodToOverride();
	}
}