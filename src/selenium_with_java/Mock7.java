package selenium_with_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mock7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.xpath("//a(class='_2I9KP_')")).click();
Thread.sleep(2000);

	}

}
