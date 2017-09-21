package nestedclasses;

public class LocalDemo {

	String instanceVariable = "Instance Variable";
	
	private void method(int param) {
		int localVariable = 10;
		class LocalClass {
			public void localMethod() {
				System.out.println("Local class method can access instance variable: " + instanceVariable);
				System.out.println("access the local var and params" + localVariable + param);
			}
		}
		
		new LocalClass().localMethod();
	}
	
	public static void main(String args[]) {
		new LocalDemo().method(20);
	}
}
