package seleniumcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Seleniumc {

	public static void main(String[] args) {
		// TODO Auto-generated me
		System.out.println("hello");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/");
	}

}
