package selenium_wait;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait_study {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=676742234347&hvpos=&hvnetw=g&hvrand=16241632758972391526&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301536&hvtargid=kwd-10573980&hydadcr=14453_2367553&gclid=Cj0KCQiAgqGrBhDtARIsAM5s0_ncDGIyiV5xSWHrS9ncft8njGt7IQCNOj4oWZEPsiDc-ts4LO4LHm4aApDdEALw_wcB");	
		//Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		
		
		
	}

}
