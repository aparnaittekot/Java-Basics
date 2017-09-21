package defaultmethods;

public interface InterfaceA {
	
	default void message(){
		System.out.println("This method is in InterfaceA");
	}
}