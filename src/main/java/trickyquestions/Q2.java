package trickyquestions;

public class Q2 {

	public static void main(String[] args) {

		Q2 object = new Q2();
		Integer testValue1 = object.testFinallyBlockWithReturnStatememtInTryBlock();
		System.out.println(testValue1);

		Integer testValue2 = object.testFinallyBlockWithReturnStatememtInCatchBlock();
		System.out.println(testValue2);

		object.testFinallyBlockWithSystemExitInTryOrCatchBlock();
	}

	private Integer testFinallyBlockWithReturnStatememtInTryBlock() {

		System.out.println("Testing whether finally block executes with a return statement in the try block");

		try {
			return 0;
		} catch (Exception e) {
		} finally {
			System.out.println("Inside finally block");
		}

		System.out.println("Outside finally block");
		return 0;
	}

	private Integer testFinallyBlockWithReturnStatememtInCatchBlock() {

		System.out.println("Testing whether finally block executes with a return statement in the catch block");

		try {
			throw new Exception();
		} catch (Exception e) {
			return 0;
		} finally {
			System.out.println("Inside finally block");
		}
	}

	private void testFinallyBlockWithSystemExitInTryOrCatchBlock() {

		System.out.println("Testing whether finally block executes with a system.exit() in the try block");

		try {
			System.exit(0);
		} catch (Exception e) {
		} finally {
			System.out.println("Inside finally block");
		}
	}
}
