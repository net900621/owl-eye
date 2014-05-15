package lib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class php_error {
	public static void phpErrorTest(WebDriver driver){
		List<WebElement> errorList = driver.findElements(By.className("php_err"));
		String str = "";
		if(errorList.size() > 0){
			for(int i = 0; i < errorList.size(); i ++){
				str = "php error:";
				str += "\n";
				str += errorList.get(i).findElement(By.className("err_title")).getAttribute("textContent");
				str += "\n";
				str += errorList.get(i).findElement(By.className("err_serverity")).getAttribute("textContent");
				str += "\n";
				str += errorList.get(i).findElement(By.className("err_message")).getAttribute("textContent");
				str += "\n";
				str += errorList.get(i).findElement(By.className("err_filename")).getAttribute("textContent");
				str += "\n";
				str += errorList.get(i).findElement(By.className("err_line_number")).getAttribute("textContent");
				error.initError(str);
			}
		}
	}
}
