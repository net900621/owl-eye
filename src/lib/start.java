package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class start {
	
	public static WebDriver startWebDriver(){
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		return driver;
	}
	
	public static void endWebDriver(WebDriver driver){
		driver.quit();
	}
	
}