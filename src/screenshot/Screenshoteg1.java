package screenshot;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshoteg1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=676742234347&hvpos=&hvnetw=g&hvrand=15677452921588928929&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301536&hvtargid=kwd-10573980&hydadcr=14453_2367553&gclid=CjwKCAiAvJarBhA1EiwAGgZl0K565Yg8MWaTj8jk3yMlj-Bzx4h1JOVDycY7O3xBh2qfGYAQW-Hz9hoC2uIQAvD_BwE");
File source  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	

	File dest= new File("G:\\All_Data\\Desktop\\testing\\screenshot\\myscreenshot.png");
	org.openqa.selenium.io.FileHandler.copy(source, dest);
	}

}
