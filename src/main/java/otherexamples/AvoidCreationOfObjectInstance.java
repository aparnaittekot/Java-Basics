package otherexamples;

class NoDirectInstance {
	private NoDirectInstance() {

	}
}

public class AvoidCreationOfObjectInstance {
	public static void main(String[] args) {
		//cannot create instance!!!!
		//NoDirectInstance noInstance = new AvoidCreationOfObjectInstance();
	}
}
