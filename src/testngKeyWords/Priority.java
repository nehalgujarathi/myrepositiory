package testngKeyWords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(groups="Regression")
  public void a() {
		Assert.fail();
		Reporter.log("TC a is running",true);
  }
  @Test(groups="sanity")
  public void b() {
	  Reporter.log("TC b is running",true);
  }
  @Test(groups="Regression")
  public void c() {
	  Reporter.log("TC c is running",true);
  }
  @Test(groups="sanity")
  public void d() {
	  Reporter.log("TC d is running",true);
}}
