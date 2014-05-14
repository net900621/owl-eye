package lib;

import javax.xml.parsers.*;

import org.w3c.dom.*;

public class xml {
	
	public static Document xmlRead(String src){
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
        try
        {  
            DocumentBuilder db = dbf.newDocumentBuilder();  
            Document doc = db.parse(src);  
            return doc;
        }  
        catch (Exception e)  
        {  
            e.printStackTrace();  
        }
        return (Document)new Object();
	}
	
}