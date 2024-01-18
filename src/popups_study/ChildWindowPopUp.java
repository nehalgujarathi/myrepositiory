package popups_study;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
Thread.sleep(1000);
WebElement mainpagetext=driver.findElement(By.xpath("(//b[text()='[Dummy Controls]'])"));
	System.out.println("main page text is" +mainpagetext.getText());
	
driver.findElement(By.xpath("(//input[@name='NewWindow'])")).click();
Thread.sleep(2000);
String mainpageid=driver.getWindowHandle();
	System.out.println("id of main page is" +mainpageid);
Set<String>	allwindowid= driver.getWindowHandles();
 Iterator<String> it = allwindowid.iterator();

 	String mainpageId=it.next();
 	String childpageid= it.next();
 	System.out.println("main page id"+mainpageId);
 	System.out.println("child page id"+childpageid);
 	
	driver.switchTo().window(childpageid);
	Thread.sleep(1000);
	//driver.manage().window().maximize()
	driver.findElement(By.xpath("(//input[@id='the7-search'])")).sendKeys("good evening");
	Thread.sleep(1000);
	 WebElement textfromchild =driver.findElement(By.xpath("(//h1[text()='About me'])"));
	 System.out.println("text from child page" +textfromchild.getText());
	 Thread.sleep(1000);
	 driver.switchTo().window(mainpageId);
	 Thread.sleep(1000);
	  WebElement mainpagetext2 = driver.findElement(By.xpath("(//p[text()='Click below to open link in new browser window'])"));
	 System.out.println("mainpagetext2 " +mainpagetext2.getText() );
	}
	

}
