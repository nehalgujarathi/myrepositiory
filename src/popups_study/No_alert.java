package popups_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://the-internet.herokuapp.com/basic_auth");
Thread.sleep(1000);
Alert alt=driver.switchTo().alert();
alt.accept();
//Thread.sleep(1000);
	}

}
