package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyWordInvocation_count {

	@BeforeMethod
public void before() {
	Reporter.log("Before method Running", true);
}
 @Test(invocationCount=5)
public void TC1() {
	Reporter.log("TC1 Running", false);
}
}
