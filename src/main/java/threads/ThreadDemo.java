package threads;

public class ThreadDemo {
	
	private int inputNumber = 10;

	public static void main(String[] args) {
		System.out.println("Main method");
		
		ThreadDemo demo = new ThreadDemo();
		Thread thread1 = new Thread(new MyRunnabeThread(demo), "T1");
		Thread thread2 = new Thread(new MyRunnabeThread(demo), "T2");
		thread2.setPriority(10);
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("After join");
		
		System.out.println("Final value : " + demo.inputNumber);
		
		
		
		
		
		/*MyThread thread1 = new MyThread("T1"); // thread in NEW state
		MyThread thread2 = new MyThread("T2"); // thread in NEW state
		
		thread2.setPriority(Thread.MIN_PRIORITY);
		
		thread1.start(); // thread in RUNNABLE state
		thread2.start(); // thread in RUNNABLE state
		
		//thread1.run(); never do it.
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("After thread start");*/
	}
	
	public int getNumber() {
		return inputNumber;
	}
	
	public synchronized void addNumber(int no) {
		System.out.println("From runnable thread: " + Thread.currentThread().getName());
		int value = getNumber();
		System.out.println("Initial value of input number :" + value);
		setNumber(value + no);
		value = getNumber();
		System.out.println("Afte modification, value of input number :" + value);
		try {
			Thread.currentThread().suspend();
			wait();
			notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void subNumber(int no) {
		System.out.println("From runnable thread: " + Thread.currentThread().getName());
		int value = getNumber();
		System.out.println("Initial value of input number :" + value);
		setNumber(value + no);
		value = getNumber();
		System.out.println("Afte modification, value of input number :" + value);
	}
	
	public void setNumber(int no) {
		this.inputNumber = no;
	}

}
