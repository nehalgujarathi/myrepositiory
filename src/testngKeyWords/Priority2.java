package testngKeyWords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority2 {
	@Test(groups="Regression")
	  public void e() {
		  Reporter.log("TC e is running",true);
	  }
	  @Test(groups="sanity")
	  public void f() {
		  Assert.fail();
		  Reporter.log("TC f is running",true);
	  }
	  @Test(groups="Regression")
	  public void g() {
		  Assert.fail();
		  Reporter.log("TC g is running",true);
	  }
	  @Test(groups="sanity")
	  public void h() {
		  Reporter.log("TC h is running",true);
	}}

