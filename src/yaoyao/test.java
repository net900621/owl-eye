package yaoyao;

import org.openqa.selenium.WebDriver;

import lib.*;
import app.*;

public class test {

	public static void main(String[] args) {
		WebDriver driver = start.startWebDriver();
//		test1.testng(driver);
		login.testlogin(driver);
		start.endWebDriver(driver);
	}
	
}