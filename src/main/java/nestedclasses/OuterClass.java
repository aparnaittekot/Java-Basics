package nestedclasses;

public  class OuterClass {
	
	String instanceVariable = "Instance Variable";
	
	private static void method1() {
		System.out.println("Outer class static method");
	}
	
	private void method2() {
		System.out.println("Outer class instance method");
	}
	
	class InnerClass {
		public void method() {
			method1();
			method2();
			System.out.println("From Inner class method");
		}
	}
	
	private static class StaticNestedClass {
		int number = 10;
		public void method () {
			method1();
			new OuterClass().method2();
			System.out.println("From static nested class");
		}
		public static void static_method () {
			method1();
			new OuterClass().method2();
			System.out.println("From static nested class");
		}
	}
}
