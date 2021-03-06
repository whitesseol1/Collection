package com.collection.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiestest {
	
	public static void main(String[] args) {
		//properties : map형식으로 데이터를 저장하는 객체
		//1. 파일연동해서 처리 -> xml,  txt, properties
		//2. 문자열(String)전용 데이터 보관
		//3. key, value형식으로 저장
		
		Properties prop=new Properties();
		//값넣기
		prop.setProperty("userId","admin");
		prop.setProperty("password","1234");
		
		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("info.properties"), "adminData"); //알아서 저장하고 닫음
			prop.storeToXML(new FileOutputStream("info.xml"), "adminData");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//프로그램에 대한 환경설정 내용을 저장할때 많이 사용		
		loadProperties(); //뒤 메소드 호출
	}
	
	public static void loadProperties() {
		//저장된 properties를 불러와보자
		//load매소드를 이용
		Properties prop=new Properties();
		try {
		     prop.load(new FileInputStream("info.properties") );
		    //prop에 저장된 데이터 출력/가져오기
		     System.out.println(prop.getProperty("userId"));
		     System.out.println(prop.getProperty("password"));
		     System.out.println(prop.getProperty("driver"));
		     System.out.println(prop.getProperty("url"));  //순서없이 출력됨
		     
		     prop.loadFromXML(new FileInputStream("info.xml"));
		     System.out.println(prop.getProperty("userId"));
		     System.out.println(prop.getProperty("password"));
		     
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	
	

}
