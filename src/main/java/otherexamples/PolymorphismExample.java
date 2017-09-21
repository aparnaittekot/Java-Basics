package otherexamples;

import java.io.IOException;

class Overload {
	void sample(int a) throws Exception {
		System.out.println("a: " + a);
	}

	void sample(int a, int b) throws IOException {
		System.out.println("a and b: " + a + "," + b);
	}

	double sample(double a) throws Exception {
		System.out.println("double a: " + a);
		return a * a;
	}
}

public class PolymorphismExample {
	public static void main(String args[]) {
		Overload Obj = new Overload();

//		double result;
//		Obj.sample(10);
//		Obj.sample(10, 20);
//		result = Obj.sample(5.5);

		//System.out.println("O/P : " + result);
	}
}