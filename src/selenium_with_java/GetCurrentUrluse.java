package selenium_with_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrluse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
Thread.sleep(10);
String url = driver.getCurrentUrl();
System.out.println("Url is-->" +url);
String expectedResult= "https://vctcpune.com/";
driver.get("https://vctcpune.com/");
Thread.sleep(10);
String actualResult = driver.getCurrentUrl();
if(expectedResult.equals(actualResult)) {
	System.out.println("url is matching");
}
else {
	System.out.println("url is not matching");
}
	}

}
