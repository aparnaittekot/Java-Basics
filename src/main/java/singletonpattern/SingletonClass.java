package singletonpattern;

class Singleton {
	// Static Class Reference
	private static Singleton obj = null;
	int a;

	private Singleton(int a) {
		this.a = a;
	}

	public static Singleton objectCreationMethod() {
		/*
		 * This logic will ensure that no more than one object can be created at
		 * a time
		 */
		if (obj == null) {
			obj = new Singleton(2);
		}
		return obj;
	}

}

public class SingletonClass {
	public static void main(String args[]) {
		// Object cannot be created directly due to private constructor
		// This way it is forced to create object via our method where
		// we have logic for only one object creation

		Singleton myobject = Singleton.objectCreationMethod();
	}
}