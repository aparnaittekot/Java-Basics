package defaultmethods;

public interface InterfaceB {

	default void message() {
		System.out.println("This method is in InterfaceB");
	}
}
