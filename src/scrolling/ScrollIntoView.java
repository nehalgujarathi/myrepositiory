package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.naukri.com/");
Thread.sleep(1000);
WebElement myelement= driver.findElement(By.xpath("(//h4[text()='Upcoming events and challenges'])"));
Thread.sleep(2000);
JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView();",myelement);
WebElement myelement2=driver.findElement(By.xpath("(//p[text()='Discover jobs across popular roles'])"));
js.executeScript("arguments[0].scrollIntoView();",myelement2 );
	
	}

}
