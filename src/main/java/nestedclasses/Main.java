package nestedclasses;

public class Main {

	public static void main(String[] args) {
		/*OuterClass.StaticNestedClass snc = new OuterClass.StaticNestedClass();
		snc.method();*/
		//OuterClass.StaticNestedClass.static_method();
		
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.method();
	}
}
