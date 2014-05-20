package app;

//import org.openqa.selenium.Alert;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import lib.*;

//import org.w3c.dom.*;

public class test1 {
	public static void testng(WebDriver driver){
		driver.get("http://test.jiandanlicai.com/");
		
//		Document doc = xml.xmlRead("src/xml/test.xml");
//
//		NodeList userName = doc.getElementsByTagName("userName");
//		NodeList passWord = doc.getElementsByTagName("password");
////		NodeList login = doc.getElementsByTagName("login");
////		int len = login.getLength();
////		for(int i =0; i < len; i++){
////			Element element = (Element)login.item(i);
////			String valUser = element.getElementsByTagName("userName").item(0).getFirstChild().getNodeValue();
////			String valPwd = element.getElementsByTagName("password").item(0).getFirstChild().getNodeValue();
////		}
//		Node user = userName.item(0).getFirstChild();
//        String valueUser = user.getNodeValue();
//        Node pwd = passWord.item(0).getFirstChild();
//        String valuePwd = pwd.getNodeValue();
//		driver.findElement(By.id("username")).sendKeys(valueUser);
//		driver.findElement(By.id("password")).sendKeys(valuePwd);
//		driver.findElement(By.className("js_login")).click();
//
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			error.fileError(e);
		}
//		if(!error.doesWebElementExist(driver, By.className("js_login"))){
//			error.initError("找不到js_login");
//		}
//		if(!error.isContentAppeared(driver, "js_login")){
//			error.initError("找不到js_login~");
//		}
//		try {
//			driver.findElement(By.className("js_login")).click();
//		} catch (Exception e) {
//			error.fileError(e);
//		}
//		System.out.println("页面Title:"+driver.getTitle()+"\n页面URL:"+driver.getCurrentUrl());
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("alert(123)");
		List<WebElement> a = driver.findElements(By.className("php_err"));
		System.out.println(a.size());
	}
}
