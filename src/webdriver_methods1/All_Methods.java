package webdriver_methods1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println("current url is" +url);
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println("title is" +title);
		Thread.sleep(1000);
		driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=13611928015669370452&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301536&hvtargid=kwd-10573980&hydadcr=14453_2367553");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		//driver.close();
		//driver.quit();

	}

}
