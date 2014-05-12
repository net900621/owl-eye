package yaoyao;

import org.openqa.selenium.WebDriver;

import lib.start;
import app.test1;

public class test {

	public static void main(String[] args) {
		WebDriver driver = start.startWebDriver();
		test1.testng(driver);
		start.endWebDriver(driver);
	}
	
}