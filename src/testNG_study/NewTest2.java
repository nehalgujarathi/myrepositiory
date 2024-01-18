package testNG_study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void TC3() {
	  Reporter.log("TC3 is running");
  }
  @Test
  public void TC4() {
	  Reporter.log("TC4 is running");
	  
  }
  @BeforeMethod
  public void beforemethod() {
	  Reporter.log("Before method is running");
  }
  @AfterMethod
  public void aftermethod() {
	  Reporter.log("After method id running");
  }
  @BeforeClass
  public void beforeclass() {
	  Reporter.log("Before class is running");
  }
  @AfterClass
  public void afterClass()
  {
  Reporter.log("afterClass class is runing", true);
  }
  @BeforeTest
  public void beforeTest()
  {
  Reporter.log("Before test is running", true);
  }
  @AfterTest
  public void AfterTest()
  {
  Reporter.log("after test is running", true);
  }
  
  
  
  
  
  
  
  
  
  
}
