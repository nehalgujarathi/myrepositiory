package serial_parallel_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class ajio {
	public void ajiotest() {
		  WebDriver  driver= new ChromeDriver();
		  driver.get("https://www.ajio.com/");
	  }
}
