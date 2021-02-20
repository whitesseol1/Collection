package com.collection.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiestest {
	
	public static void main(String[] args) {
		//properties : map�������� �����͸� �����ϴ� ��ü
		//1. ���Ͽ����ؼ� ó�� -> xml,  txt, properties
		//2. ���ڿ�(String)���� ������ ����
		//3. key, value�������� ����
		
		Properties prop=new Properties();
		//���ֱ�
		prop.setProperty("userId","admin");
		prop.setProperty("password","1234");
		
		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("info.properties"), "adminData"); //�˾Ƽ� �����ϰ� ����
			prop.storeToXML(new FileOutputStream("info.xml"), "adminData");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//���α׷��� ���� ȯ�漳�� ������ �����Ҷ� ���� ���		
		loadProperties(); //�� �޼ҵ� ȣ��
	}
	
	public static void loadProperties() {
		//����� properties�� �ҷ��ͺ���
		//load�żҵ带 �̿�
		Properties prop=new Properties();
		try {
		     prop.load(new FileInputStream("info.properties") );
		    //prop�� ����� ������ ���/��������
		     System.out.println(prop.getProperty("userId"));
		     System.out.println(prop.getProperty("password"));
		     System.out.println(prop.getProperty("driver"));
		     System.out.println(prop.getProperty("url"));  //�������� ��µ�
		     
		     prop.loadFromXML(new FileInputStream("info.xml"));
		     System.out.println(prop.getProperty("userId"));
		     System.out.println(prop.getProperty("password"));
		     
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	
	

}
