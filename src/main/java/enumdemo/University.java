package enumdemo;

public enum University {
	APARNA("2016SP93005"), DIVYA("2016SP93004"), VINAY("2016SP93006");
	
	private String usn;

	University(String usn) {
		this.usn = usn;
	}

	public String getUsn() {
		return usn;
	}
}