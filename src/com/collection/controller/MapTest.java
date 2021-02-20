package com.collection.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.collection.model.vo.Fruit;

public class MapTest {
	
	public static void main(String[] args) {
		//map�� ���� �˾ƺ���.
		//������ �̷�����ִ� �ڷᱸ�� key : value
		//key : Object / value : Object
		//Collection�������̽��� ��ӹ��� ����
		//Map�������̽��� �����Ǿ�����.
		
		HashMap map=new HashMap();
		//������ �ֱ�
		//key value�� ��� �����ؾ���.
		//put(key,value) �żҵ带 �̿���
		//key : String, Integer�� ���� �����.
		//value : vo(�����ͺ����� ��ü)�� ���.
		map.put("������", 19);
		map.put("�����", 29);
		map.put(1, "������");
		map.put(2, "������");
		
		System.out.println(map); //�Է¼� �ƴ�, �����������
		
		//map�� ����� ������ ��������
		//map�� ����� �����ʹ� key���� �������� ������.
		//key�� �ε����� �����.
		System.out.println(map.get("������")); //key���� ������ value�� ������
		System.out.println(map.get("�����"));
		
		//key���� �ߺ��� �Ұ���, value�ߺ��� ����
		System.out.println(map.get(1));
		map.put(1, "�赿��");
		System.out.println(map.get(1)); //�ִ� key���� ��������� value�� ����Ե�
		
		//�� �����ϱ�
		//remove(key��)�żҵ� �̿� -> key���� �������� ����
		map.remove(1);
		System.out.println(map);
		
		System.out.println(map.size()); //ũ�� size�� �ľ��Ҽ�����
		
		//Map�� ����Ǿ��ִ� ��ü �ڷ� ��ȸ�ϱ�
		//key�� �������� ���� ������.
		//1.key���� Ȯ���ϰ� �� key������ �����͸� �����;���
		//key Set������� ������ ��. -> Iterator�� ����ؾ���
		
//		Iterator it=map.keySet().iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next()); //key���� ��µ�
//		}
		
		Iterator it=map.keySet().iterator();
	
		while(it.hasNext()) {
			Object key=it.next();	
			Object value=map.get(key);
			System.out.println(key+":"+value); //value���� ��µ�
		}
		
		//Map.Entry�� �̿��ؼ� key, value���� ���ÿ� �������°�
		Set entrySet=map.entrySet(); //Map.EntryŬ����
		Iterator entry=entrySet.iterator();
		
		while(entry.hasNext()) {
			//it -> Map.Entry��ü�� �� ����.
			Map.Entry e=(Map.Entry)entry.next();
			       //Object origin=((Fruit)e).getOrigin();
			//getKey() -> key���� ������ / getValue() -> value
			System.out.println(e.getKey()+" : "+e.getValue());
			
		}
		
		//�����Ͱ� �ִ��� Ȯ��
		System.out.println(map.isEmpty()); 
		
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue(29));
		
		//map�� �̿��ϱ�
		map.clear();
		
		map.put(1, new Fruit("��","���ֵ�",10,15000));
		map.put(2, new Fruit("���ξ���","�ʸ���",6,7000));
		map.put(3, new Fruit("����","�̱�",1,3000));
		
		//map�� �ִ� ���� �̸�, �������� ����ϱ�
		
		it=map.keySet().iterator();
		//set s=map.keySet();
		//it=s.iterator();
		
		while(it.hasNext()) {
			Object key=it.next();
			Fruit f=(Fruit)map.get(key);
			System.out.println(f.getName()+" "+f.getOrigin());
			
			
//			Object value=map.get(key);
//			Object origin=((Fruit)value).getOrigin();
//			System.out.println(key+":"+origin); //value���� ��µ�
//			
		}
		
		//Map.Entry�̿��ؼ� ó���ϱ�
		Set es=map.entrySet();//Map.EntryŬ����
		Iterator iee=es.iterator();
		while(iee.hasNext()) {
			Map.Entry e=(Map.Entry)iee.next();
			Fruit f=(Fruit)e.getValue();
			System.out.println(f.getName()+" "+f.getOrigin());
		}
		
		//values();
		Collection c=map.values();
		System.out.println(c);
		Iterator it3=c.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		ArrayList list=new ArrayList(c);
		System.out.println(list.get(1));
		
		list.clear();
		HashMap data=new HashMap();
		data.put("name", "������");
		data.put("age", 19);
		data.put("address", "��⵵ �����");
		data.put("userId", "admin");  //������ �̷������� ����
		
		list.add(data);
		list.add(data);
		list.add(data);
		list.add(data);
		list.add(data);  //HashMap������
		
		
		for(int i=0;i<list.size();i++) {
		   for(Object o : ((HashMap)list.get(0)).keySet()) {
			HashMap m=(HashMap)list.get(0);
			System.out.print(m.get(o)+" ");
		    }
		    System.out.println();
		   
		   
		}
	}
	
	
	

}
