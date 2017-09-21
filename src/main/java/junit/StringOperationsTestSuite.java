package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		StringOperationsTest.class,
		StringOperationsTest1.class
})
public class StringOperationsTestSuite {
}
