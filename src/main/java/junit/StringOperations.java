package junit;

public class StringOperations {

	public String convertToUpperCase(String value) {
		if (value == null) {
			throw new NullPointerException("Please enter a non-null string");
		}
		return value.toUpperCase();
	}

	public String[] splitBySpace(String value) {
		return value.split(" ");
	}

	public String concatinate(String value1, String value2) {
		return value1.concat(value2);
	}
}
