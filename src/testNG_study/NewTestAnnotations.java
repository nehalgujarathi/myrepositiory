package testNG_study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTestAnnotations {
  @Test
  public void TC1() {
	  Reporter.log("Tc1 method is running", true);
  }
  @Test
  public void TC2() {
	Reporter.log("Tc2 my method is running",true);  
  }
  @BeforeMethod
  public void login() {
	Reporter.log("Before method is running",true);  
  }
  @BeforeClass
  public void beforeclass() {
	  Reporter.log("Open browser before class", true);
  }
  @AfterClass
  public void afterclass() {
	  Reporter.log("close browser-->after class",true);
  }
  @AfterMethod
  public void logOut() {
	  Reporter.log("Logout is done",true);
  }
  @BeforeSuite
  public void beforeSuite()
  {
  Reporter.log("Before suite is running", true);
  }
  @AfterSuite
  public void afterSuite()
  {
  Reporter.log("After Suite is running", true);
  }
}
