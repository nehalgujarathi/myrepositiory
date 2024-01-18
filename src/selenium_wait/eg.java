package selenium_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eg {

	public static void main(String[] args) throws InterruptedException {
		//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://discoveryplus.in/");
		
		driver.findElement(By.xpath("(//h6[contains(text(),'Sign In')])[3]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		

	}

}
