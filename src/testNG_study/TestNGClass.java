package testNG_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass {
  @Test
  public void f() {
	  System.out.println("Hi this is printing statement");
 Reporter.log("Hi this is reporter, without boolean parameter");
  Reporter.log("HI yjis is Reporter, with boolean parameter",true);
  
  }
  @Test
  public void fblaunch(){
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Reporter.log("fb launching",true);
  }
  @Test
  public void  instalaunch(){
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Reporter.log("Insta launching",true);
}}
