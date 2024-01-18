package actions_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
Thread.sleep(1000);
 WebElement rightclick=driver.findElement(By.xpath("(//span[text()='right click me'])"));
	Actions act= new Actions(driver);
	
	act.moveToElement(rightclick).contextClick().build().perform();
	Thread.sleep(1000);
	WebElement doubleclick=driver.findElement(By.xpath("(//button[text()='Double-Click Me To See Alert'])"));
	Actions act1= new Actions(driver);
	
	act1.moveToElement(doubleclick).doubleClick().build().perform();
	Thread.sleep(1000);
	driver.get("https://testautomationpractice.blogspot.com/");
	Thread.sleep(1000);
	
	}

}
