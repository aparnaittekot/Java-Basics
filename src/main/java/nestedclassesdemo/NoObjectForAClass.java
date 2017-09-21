package nestedclassesdemo;

class Sample {
	private int a;

	private Sample(int a) {
		super();
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}

public class NoObjectForAClass {
	public static void main(String[] args) {
		//Sample s = new Sample(1); Cannot create object!!!!!!!
	}
}