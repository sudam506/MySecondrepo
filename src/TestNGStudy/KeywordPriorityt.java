package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordPriorityt {

@Test(priority=1)
	public void c() {
	Reporter.log("c is running", true);
}
@Test(priority=1)
public void a() {
	Reporter.log("a is running", true);
}
@Test(priority=2)
public void b() {
	Reporter.log("b is running", true);
}
}
