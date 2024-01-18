package selenium_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
//driver.manage().window().maximize();
driver.get("https://discoveryplus.in/");
Thread.sleep(5000);
driver.findElement(By.xpath("(//h6[contains(text(),'Sign In')])[3]")).click();

//WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(1000));

//w.until(ExpectedConditions.visibilityOf(clickonsignupbutton));
//.click();
		
		
		
	}

}
