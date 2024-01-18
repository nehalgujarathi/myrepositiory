package setPointStudy;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPointStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://www.naukri.com/");
Thread.sleep(1000);
Point defaultPosition = driver.manage().window().getPosition();
System.out.println(defaultPosition);
Point p = new Point(300,200);
Thread.sleep(1000);
driver.manage().window().setPosition(p);


	}

	
}
