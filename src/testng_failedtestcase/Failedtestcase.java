package testng_failedtestcase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failedtestcase {
  @Test
  public void TC1() {
	  Reporter.log("TC1 is running");
	  
  }
  @Test
  public void TC2() {
	 // Assert.fail();
	  Reporter.log("TC2 is running");
	  
  }
  @Test
  public void TC3() {
	 // Assert.fail();
	  Reporter.log("TC3 is running");
	  
  }
  @Test
  public void TC4() {
	  Reporter.log("TC4 is running");
	  
  }
}
