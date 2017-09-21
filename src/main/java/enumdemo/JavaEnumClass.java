package enumdemo;

public class JavaEnumClass {
	public static void main(String[] args) {

		SimpleJavaEnum[] values = SimpleJavaEnum.values();
		for (SimpleJavaEnum value : values) {
			System.out.println(value.ordinal());
		}
	}
}