package lib;

import org.openqa.selenium.By;
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
	
	public static void login(WebDriver driver){
		driver.get("https://www.jiandanlicai.com/user/login");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("net900621@163.com");
		driver.findElement(By.id("password")).sendKeys("19900621");
		driver.findElement(By.className("js_login")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			error.fileError(e);
		}
	}
	public static void logout(WebDriver driver){
		driver.get("https://www.jiandanlicai.com/user/logout");
	}
}