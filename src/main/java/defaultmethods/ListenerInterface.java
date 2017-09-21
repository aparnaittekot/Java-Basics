package defaultmethods;

public interface ListenerInterface {
	default void method() {
		System.out.println("This method is in Interface!!!!");
	}
}
