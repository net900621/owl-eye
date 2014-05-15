package app;

import org.openqa.selenium.WebDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import lib.*;

public class phpTest {
	public static void phpErrorTest(WebDriver driver, String list){
		Document doc = xml.xmlRead(list);
		Element element = doc.getDocumentElement();
		NodeList login = doc.getElementsByTagName("list");
		int len = login.getLength();
		String phplist = "";
		for(int i =0; i < len; i++){
			phplist = element.getElementsByTagName("page").item(i).getFirstChild().getNodeValue();
			driver.get(phplist);
			php_error.phpErrorTest(driver);
		}
	}
	public static void phpErrorTestLogin(WebDriver driver){
		start.login(driver);
		phpErrorTest(driver,"src/xml/phpError/list.xml");
	}
	public static void phpErrorTestNoLogin(WebDriver driver){
		start.logout(driver);
		phpErrorTest(driver,"src/xml/phpError/listout.xml");
	}
}
