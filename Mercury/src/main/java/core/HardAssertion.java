/**
 * 
 */
package core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.asserts.Assertion;
import org.testng.asserts.IAssert;

/**
 * @author adityas
 *
 */
public class HardAssertion extends Assertion {
	
	private final Logger log = LoggerFactory.getLogger("STEP");

	@Override
	public void onAssertFailure(IAssert assertCommand, AssertionError ex) {
		log.info("FAILED : Assert Command : {}  , Message : {} ",assertCommand,ex);
		throw new AssertionError(ex);
	}
	
	@Override
	public void onAssertSuccess(IAssert assertCommand) {
		log.info("PASS : Success Assert on Command : {} ",assertCommand);
	}
	

	@Override
	public void onAfterAssert(IAssert assertCommand) {
		log.info("STEP : Assert Finished ",assertCommand);
	}

	@Override
	public void onBeforeAssert(IAssert assertCommand) {
		log.info("START : Assert Command : {}",assertCommand);
	}
	

}
