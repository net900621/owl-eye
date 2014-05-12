package lib;
import java.io.*;
import java.util.*; 

public class file {
	
	private static  String calToNum(int y){
		int _cal = Integer.parseInt(y + "", 10);
		return _cal > 9 ? _cal + "" : "0" + _cal; 
	}
	
	public static void fileWrite(String msg){
		String s1 = new String();
		int y,m,d,h,mi,se;    
		Calendar cal=Calendar.getInstance();    
		y=cal.get(Calendar.YEAR);    
		m=cal.get(Calendar.MONTH);    
		d=cal.get(Calendar.DATE);    
		h=cal.get(Calendar.HOUR_OF_DAY);    
		mi=cal.get(Calendar.MINUTE);    
		se=cal.get(Calendar.SECOND); 
		msg += "\n";
		try {
			File f = new File("src/log/" + calToNum(y) + "-" + calToNum(m) + "-" + calToNum(d));
			if(!f.exists()){
				f.createNewFile();
			}
			s1 += calToNum(h)+":"+calToNum(mi)+":"+calToNum(se) + "      ";
			s1 += msg;
		
			BufferedWriter output = new BufferedWriter(new FileWriter(f,true));
			output.write(s1);
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}