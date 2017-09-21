package junit;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringOperationsTest1 {

	static StringOperations stringOperations;

	@BeforeClass
	public static void setUpForAllTests() {
		System.out.println("@BeforeClass is called.");
		stringOperations = new StringOperations();
	}

	@Test
	public void testConvertToUpperCase() {

		System.out.println("testConvertToUpperCase() is called.");

		String input = "Aparna";

		String actualOutput = stringOperations.convertToUpperCase(input);
		String expectedOutput = "APARNA";

		assertEquals(expectedOutput, actualOutput);
	}

}
