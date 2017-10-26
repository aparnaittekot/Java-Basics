package trickyquestions;

class Test {
	
	public static void staticMethod() {

	}

	private void privateMethod() {

	}
	
	public void publicMethod() {

	}
}

public class Q3 extends Test{
	
	
	//Cannot override static method of base class
	/*@Override
	public static void staticMethod() {
		
	}*/
	
	
	//Cannot override a private method of base class
	/*@Override
	private void privateMethod() {
		
	}*/
	
	@Override
	public void publicMethod() {
		
	}
}