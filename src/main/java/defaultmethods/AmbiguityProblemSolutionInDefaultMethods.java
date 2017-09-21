package defaultmethods;

public class AmbiguityProblemSolutionInDefaultMethods implements InterfaceA, InterfaceB {

	public void message() {
		InterfaceA.super.message();
		InterfaceB.super.message();
	}

	public static void main(String[] args) {

		AmbiguityProblemSolutionInDefaultMethods ambiguityDefMethods = new AmbiguityProblemSolutionInDefaultMethods();
		ambiguityDefMethods.message();
	}
}