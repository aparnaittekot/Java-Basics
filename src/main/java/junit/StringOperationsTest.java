package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringOperationsTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	static StringOperations stringOperations;

	@BeforeClass
	public static void setUpBeforeAllTests() {
		System.out.println("setUpBeforeAllTests() is called.");
		stringOperations = new StringOperations();
	}

	@Before
	public void setUpBefore() {
		System.out.println("setUpBefore() is called.");
	}

	@After
	public void setUpAfter() {
		System.out.println("setUpAfter() is called.");
	}

	@Test
	public void testConcatinateStrings() {

		System.out.println("testConcatinateStrings() is called.");

		String value1 = "Hello";
		String value2 = " World";

		String actualOutput = stringOperations.concatinate(value1, value2);
		String expectedOutput = "Hello World";

		assertEquals(expectedOutput, actualOutput);
		assertTrue(expectedOutput.equals(actualOutput));
	}

	@Test(expected = NullPointerException.class)
	public void testForNullStringException() {
		System.out.println("testForNullStringException() is called.");

		String value = null;
		stringOperations.convertToUpperCase(value);

	}

	@Test(expected = NullPointerException.class)
	public void testForNullStringExceptionUsingRule() throws Exception {
		System.out.println("testForNullStringException() is called.");

		String value = null;
		stringOperations.convertToUpperCase(value);

		exception.expect(NullPointerException.class);
		exception.expectMessage("Please enter a non-null");

	}

	@AfterClass
	public static void setUpAfterAllTests() {
		System.out.println("setUpAfterAllTests() is called.");
		stringOperations = new StringOperations();
	}
}
