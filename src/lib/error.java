package lib;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 

public class error {
	public static void fileError(Exception e){
		String  err = "";
		for(int i = 0; i < e.getStackTrace().length; i++){
			err += e.getStackTrace()[i] + "\n";
		} 
		String [] stringArr = e.toString().split("\n");
		file.fileWrite(stringArr[0].toString() + "\n" + err + "\n");
	}
	public static void initError(String e){
		file.fileWrite(e + "\n");
	}
	public static boolean doesWebElementExist(WebDriver driver,By selector) {
        try { 
        	  driver.findElement(selector); 
              return true; 
        } catch (Exception e) { 
              return false; 
        } 
    }
	public static boolean isContentAppeared(WebDriver driver,String content) {  
	    boolean status = false;  
	    try {  
	        driver.findElement(By.xpath("//*[contains(.,'" + content + "')]"));  
	        System.out.println(content + " is appeard!");  
	        status = true;  
	    } catch (Exception e) {  
	        status = false;  
	        System.out.println("'" + content + "' doesn't exist!");  
	    }  
	    return status;  
	}  
}