package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class ScreenShotWithRandomName {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		Thread.sleep(1000);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		RandomString rs= new RandomString();
		String s=rs.make();
		File dest = new File("G:\\All_Data\\Desktop\\testing\\screenshot\\myscreenshot"+s+".png");
		org.openqa.selenium.io.FileHandler.copy(source, dest);
		
	}

	
}
