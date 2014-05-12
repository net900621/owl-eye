package yaoyao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import lib.start;
import app.test1;

public class test {

	public static void main(String[] args) {
		start.startWebDriver();
		WebDriver driver = new ChromeDriver();
		test1.testng(driver);
		driver.quit();
	}
}
