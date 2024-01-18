package popups_study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_window_handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("(//span[text()='Remote'])")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//span[text()='MNC'])")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//span[text()='Banking & Finance'])")).click();
Thread.sleep(1000);
 Set<String> idsalltabs =driver.getWindowHandles();
 //System.out.println("ids are"+idsalltabs);
 //Iterator<String> Ids=  idsalltabs.iterator();
 ArrayList<String>al= new ArrayList<>(idsalltabs);
 for(int i=0;i<al.size();i++) {
	 Thread.sleep(1000);
	 driver.switchTo().window(al.get(i));
	 Thread.sleep(1000);
	 System.out.println(driver.getTitle());
	 Thread.sleep(1000);
	 
 }
 
	}

}
