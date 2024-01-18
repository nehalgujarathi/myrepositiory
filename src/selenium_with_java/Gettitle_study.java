package selenium_with_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle_study {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://vctcpune.com/");
Thread.sleep(1000);
String title = driver.getTitle();
System.out.println("Title is " +title);
Thread.sleep(3000);
String expectedResult= "Log in to Facebook";
driver.get("https://www.facebook.com/login/");
String actualResult = driver.getTitle();
if(expectedResult.equals(actualResult)) {
	System.out.println("title is matching and tc is failed");
}
else {
	System.out.println("title is not matching");
}
	}

}
