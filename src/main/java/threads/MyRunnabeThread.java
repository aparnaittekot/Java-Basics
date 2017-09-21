package threads;

public class MyRunnabeThread implements Runnable {
	
	ThreadDemo demo;
	
	public MyRunnabeThread(ThreadDemo demo) {
		this.demo = demo;
	}

	@Override
	public void run() {
		demo.addNumber(20);
	}
}
