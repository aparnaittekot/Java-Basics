package singletonpattern;

class ThreadSafeSingletonSample {
	private static ThreadSafeSingletonSample threadSafe = new ThreadSafeSingletonSample();

	//cannot create an object if constructor is private
	private ThreadSafeSingletonSample() {

	}

	static ThreadSafeSingletonSample getInstance() {
		return threadSafe;
	}
}

public class ThreadSafeSingleton {
	public static void main(String[] args) {
		
		//Will allow only creation of one object
		//we cannot create object of ThreadSafeSingletonSample class
		ThreadSafeSingletonSample s = ThreadSafeSingletonSample.getInstance(); //no object, its static
	}
}