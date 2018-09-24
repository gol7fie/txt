import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;



public class XXX {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(null+"ss");
		Properties ruleMapProp = new Properties();
    	ruleMapProp.load(XXX.class.getClassLoader().getResourceAsStream("map.properties"));
    	
    	BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\mtl803168\\Desktop\\new 3.txt")), "UTF-8"));
//System.out.println(ruleMapProp.get("﻿[[EON]]กรุณาตรวจสอบเบี้ย"));
    	String s = "";
    	while((s=in.readLine()) != null) {
//    		System.out.println(ruleMapProp.get(s));
    	}
	}

}
