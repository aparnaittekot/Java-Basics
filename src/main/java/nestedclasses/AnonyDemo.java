package nestedclasses;

public class AnonyDemo {
	interface Greetable {
        public void Hello();
        public void HelloWithMessage(String message);
    }
	
	public void sayHello() {
		Greetable greet = new Greetable() {

			@Override
			public void Hello() {
				System.out.println("Hallo");
				
			}
			@Override
			public void HelloWithMessage(String message) {
				System.out.println(message);
				newmethod();
				
			}
			
			public void newmethod() {
				
			}
		};
		greet.Hello();
		greet.HelloWithMessage("Hallo, Guten Tag");
	}
	
	public static void main(String args[]) {
		new AnonyDemo().sayHello();
	}
}
