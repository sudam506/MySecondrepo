package TestNGStudy;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_DependOnMethods {

@Test(priority=1)
public void login() {
	Reporter.log("Login successful", true);
   // Assert.fail();
}

@Test(priority=2)
public void verify_pin() {
	Reporter.log("Pin verified", true);
}
@Test(dependsOnMethods="login")
public void logout() {
	Reporter.log("logout success", true);
}
}
