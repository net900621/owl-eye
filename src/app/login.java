package app;

import lib.error;
import lib.xml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.*;
import org.w3c.dom.NodeList;

public class login {
	public static void testlogin(WebDriver driver){
		Document doc = xml.xmlRead("src/xml/login/login.xml");
		Element element = doc.getDocumentElement();
		NodeList login = doc.getElementsByTagName("login");
		int len = login.getLength();
		
		for(int i =0; i < len; i++){
			driver.get("https://www.jiandanlicai.com/user/login");
			System.out.println("根元素为:"+element.getTagName());
			String valUser = element.getElementsByTagName("userName").item(i).getFirstChild().getNodeValue();
			String valPwd = element.getElementsByTagName("password").item(i).getFirstChild().getNodeValue();
			int valT = Integer.parseInt(element.getElementsByTagName("truely").item(i).getFirstChild().getNodeValue());
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys(valUser);
			driver.findElement(By.id("password")).sendKeys(valPwd);
			driver.findElement(By.className("js_login")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				error.fileError(e);
			}
			boolean right = valT == 1 ? true : false;
			if(error.doesWebElementExist(driver, By.className("js_login")) && right){
				error.initError("账号无法登陆！");
			}else if(!error.doesWebElementExist(driver, By.className("js_login")) && !right){
				error.initError("错误账号也能登陆！");
			}else if(!error.doesWebElementExist(driver, By.className("js_login")) && right){
				driver.get("https://www.jiandanlicai.com/user/logout");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					error.fileError(e);
				}
			}
		}
	}
}
