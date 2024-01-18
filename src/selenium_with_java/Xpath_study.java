package selenium_with_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_study {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/login/");
driver.manage().window().maximize();
Thread.sleep(1000);
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.xpath("//span[@class='_27h2j1']")).click();

driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nehalgujarathi@gmail.com");
driver.get("https://www.redbus.in/");
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Mumbai");
driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Pune");
driver.findElement(By.xpath("//span[@class='dateText']")).sendKeys("18");
driver.findElement(By.xpath("//button[@id='search_button']")).click();

	}

}
