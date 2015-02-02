import org.junit.Test;
import org.mule.munit.runner.functional.FunctionalMunitSuite;

public class CronExampleTest extends FunctionalMunitSuite {

	@Override
	protected String getConfigResources() {
		return "src/main/app/MUnitSFTest.xml";
	}

	@Override
	public boolean haveToMockMuleConnectors() {
		return false;
	}


	/**
	 * Java based Munit test case. Contains mocking and invocation of flows and
	 * assertions.
	 */
	@Test
	public void validateCronFlow() throws Exception {
	}

}
