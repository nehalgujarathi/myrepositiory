package iframe_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
//driver.manage().window().maximize();
driver.get("https://demo.automationtesting.in/Frames.html");
Thread.sleep(1000);
driver.switchTo().frame("singleframe");
String myTest = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
System.out.println("text is "+myTest);
driver.switchTo().defaultContent();	
WebElement button=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));	
	System.out.println("display status of button is"+button.isDisplayed());
	
	
	}

}
