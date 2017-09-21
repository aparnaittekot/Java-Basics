package threads;

public class MyThread extends Thread {
	 public MyThread(String name) {
		 super(name);
	 }
	 
	@Override
    public void run() {
		System.out.println("with in thread: " + getName());
    }
}
