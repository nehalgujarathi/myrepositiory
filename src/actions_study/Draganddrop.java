package actions_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// TODO Auto-generated method stub
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		 WebElement dragable=driver.findElement(By.xpath("(//div[@id='draggable'])"));
		 WebElement droppable=driver.findElement(By.xpath("(//div[@id='droppable'])"));
		 Actions ACT = new Actions(driver);
		 ACT.clickAndHold(dragable).release(droppable).build().perform();
		 WebElement sunday = driver.findElement(By.id("sunday"));
		 WebElement monday = driver.findElement(By.id("monday"));
		 WebElement tuesday = driver.findElement(By.id("tuesday"));

		 Actions act= new Actions(driver);
		 act.scrollToElement(sunday).perform();

		 Thread.sleep(1000);
		 sunday.click();

		 Thread.sleep(500);
		 monday.click();
		 Thread.sleep(500);
		 
		 WebElement slider=driver.findElement(By.xpath("//span[@tabindex='0']")); 
		 Actions act1= new Actions(driver);
		 System.out.println(slider.getLocation());
		 act1.moveToElement(slider).dragAndDropBy(slider, 889, 0).build().perform();
	}

}
