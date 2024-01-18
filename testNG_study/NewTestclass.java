package testNG_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestclass {
  @Test
  public void TC1() {
	 Reporter.log("TC1 is running",true);
  }
  @Test
  public void TC2() {
	  Reporter.log("TC2 is running",true);
  }
  @BeforeMethod(){
	  Reporter.log("Before method is running",true);
  }
  @AfterMethod{
	  Reporter.log("After method is running",true);
  }
  @BeforeClass
  public void beforeClass()
  {
  Reporter.log("Before class is runing", true);
  }
  @AfterClass
  public void afterClass()
  {
  Reporter.log("afterClass class is runing", true);
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
}
