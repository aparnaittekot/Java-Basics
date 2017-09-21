package enumdemo;

public enum JavaEnum {
	ZERO("0000", 1), ONE("0001", 1), TWO("0010", 1), THREE("0011", 1), FOUR("0100", 1), FIVE("0101", 1);

	String binaryNumber; //write the variables you need 
	int flag;

	JavaEnum(String binaryNumber, int flag) { //Constructor with all fields
		this.binaryNumber = binaryNumber;
		this.flag = flag;
	}

	public String getBinaryNumber() { // Getters / setters as per your requirement
		return binaryNumber;
	}

	public int getFlag() {
		return flag;
	}
}