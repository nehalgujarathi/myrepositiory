package popups_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivision {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
Thread.sleep(5000);
driver.findElement(By.xpath("//span[@role='button']")).click();
Thread.sleep(1000);	
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoes");
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
