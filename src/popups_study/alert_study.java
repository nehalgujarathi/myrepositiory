package popups_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_study {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@name='submit'])")).click();
	 Alert alt=driver.switchTo().alert();
	 Thread.sleep(2000);
	alt.dismiss();
	Thread.sleep(1000);
	driver.findElement(By.name("cusid")).sendKeys("12345");
	//driver.findElement(By.xpath("//input[@nme='cusid'")).sendKeys("12345");
	}

}
