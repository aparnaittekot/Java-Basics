package defaultmethods;

public class ClassImplementingDefaultMethods implements ListenerInterface {

	public void method() {
		System.out.println("This method is in Class!!!!");
	}

	public static void main(String[] args) {
		ClassImplementingDefaultMethods defMethod = new ClassImplementingDefaultMethods();
		defMethod.method();
	}
}
