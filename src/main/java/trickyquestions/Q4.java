package trickyquestions;

public class Q4 {
	public static void main(String[] args) {
		Double answer = 1.0 / 0.0;
		System.out.println(answer);

		System.out.println(Double.POSITIVE_INFINITY);

		// Value that cannot be expressed with a valid floating point number.
		Double negativeValue = -1.0;
		Double nanvalue = Math.sqrt(negativeValue);

		System.out.println(Double.isNaN(nanvalue));

		int value = (int) (1.0 / 0.0);
		System.out.println(value);

		float n = 1024.0f;
		float result = n / 1024 * 10;
		System.out.println(result);

		//Floating point numbers represented in the form "c*2^q" 
		//0.5 represented as 1 * 2 - 1 while 0.1 is impossible to represent them.
		//0.1 will be casted to double since it is not representable in float.
		System.out.println(0.5 == 0.5f);
		System.out.println(0.1 == 0.1f);
	}
}
