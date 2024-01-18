package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unorderedlist_study {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?authuser=0");
		Thread.sleep(2000);
driver.findElement(By.xpath("(//textarea[@class='gLFyf'])")).sendKeys("honda");
Thread.sleep(2000);
List<WebElement> searchresult= driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
for( WebElement src:searchresult) {
	System.out.println(src.getText());
}
String expectedresult = "honda elevate" ;
for(WebElement sr1: searchresult) {
	String actualresult= sr1.getText();
	if(actualresult.equals(expectedresult)) {
		sr1.click();
		break;
	}
}
Thread.sleep(2000);
driver.findElement(By.xpath("(//a[text()='Images'])")).click();
	}

}
