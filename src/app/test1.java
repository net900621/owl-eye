package app;

import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import lib.xml;

import javax.xml.parsers.*;

import lib.*;

import org.w3c.dom.*;

public class test1 {
	public static void testng(WebDriver driver){
		driver.get("https://www.jiandanlicai.com/user/login");
		
		Object xmlObj = xml.xmlRead("src/xml/test.xml");
		Document doc = (Document) xmlObj;
		
		NodeList userName = doc.getElementsByTagName("userName");
		NodeList passWord = doc.getElementsByTagName("password");
		Node user = userName.item(0).getFirstChild();
        String valueUser = user.getNodeValue();  
        Node pwd = passWord.item(0).getFirstChild();
        String valuePwd = pwd.getNodeValue();  
		driver.findElement(By.id("username")).sendKeys(valueUser);
		driver.findElement(By.id("password")).sendKeys(valuePwd);
		driver.findElement(By.className("js_login")).click();
		
//		driver.findElement(By.linkText("/logout"))
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			error.fileError(e);
		}
		if(!error.doesWebElementExist(driver, By.className("js_login"))){
			error.initError("找不到js_login");
		}
		if(!error.isContentAppeared(driver, "js_login")){
			error.initError("找不到js_login~");
		}
		try {
			driver.findElement(By.className("js_login")).click();
		} catch (Exception e) {
			error.fileError(e);
		}
//		System.out.println("页面Title:"+driver.getTitle()+"\n页面URL:"+driver.getCurrentUrl());
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("alert(123)");
	}
}
