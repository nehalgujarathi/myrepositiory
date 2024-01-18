package selenium_with_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicexpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=8875377970837266603&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301536&hvtargid=kwd-10573980&hydadcr=14453_2371562");
Thread.sleep(1000);
driver.findElement(By.xpath("(//a[text()='Mobiles'])")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//img[@alt='Iphone 15'])")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]")).click();

//driver.get("https://www.facebook.com/login/");
	//driver.manage().window().maximize();
	//Thread.sleep(1000);
	//driver.findElement(By.xpath("(//a[text()='Sign up for Facebook'])")).click();
	//Thread.sleep(1000);
	//boolean result =  driver.findElement(By.xpath("(//input[@value='2'])")).isSelected();
	//System.out.println("not selected" +result);
	//Thread.sleep(1000);
	//driver.findElement(By.xpath("(//input[@value='2'])")).click();
	//Thread.sleep(1000);
	//boolean result1 =  driver.findElement(By.xpath("(//input[@value='2'])")).isSelected();
	//System.out.println("not selected" +result1);
	}

}
