package typechecking;

class ChildClass {
	ChildClass me() {
		return this;
	}
}

public class TypeChecks extends ChildClass {
	public static void main(String[] args) {
		new TypeChecks().me();
	}
}