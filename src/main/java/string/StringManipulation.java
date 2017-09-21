package string;

public class StringManipulation {
	public static void main(String[] args) {

		String text = "Hello world";

		char ch = text.charAt(0);
		System.out.println("charAt example : " + ch);

		String text1 = "sampleString";
		String text2 = "samplestring";
		System.out.println("equal example : " + text1.equals(text2));

		text1 = "sampleString";
		text2 = "SAMPLESTRING";
		System.out.println("equalIgnoreCase example : " + text1.equalsIgnoreCase(text2));

		text1 = "sampleString";
		text2 = "SAMPLESTRING";
		System.out.println("concat example : " + text1.concat(text2));

		text1 = "sampleString";
		text2 = "SAMPLESTRING";
		System.out.println("concat using + example : " + (text1 + text2));

		text = "JavaTraining";
		System.out.println("substring 1 example : " + text.substring(5));
		System.out.println("substring 2 example : " + text.substring(5, 9));
		System.out.println("length example : " + text.length());

	}
}
