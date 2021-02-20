package com.collection.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.collection.common.FruitNameAscending;
import com.collection.common.FruitNameDescending;
import com.collection.common.FruitPriceAscending;
import com.collection.model.vo.Fruit;



public class ArrayListTest {
	
	public static void main(String[] args) {
		//ArrayList�� �迭�� ������ �������� ������ ������
		//�迭�� ������ ������ �ڷᱸ�������̴�.
		//Ŭ������ �Ǿ��־� �żҵ带 �̿��Ͽ� �����͸� ����, ����, �߰��� �� �ִ�.
		ArrayList list=new ArrayList();//Ŭ������ ������ �̿��ϱ� ���ؼ��� �ݵ�� ����
		//default�� 10���� ��������� Ȯ��(�迭)
		//��������� �����ؼ� ������ �� ����
		ArrayList list2=new ArrayList(20); //20�� ����
		//�����͸� object[]�� ����
		
		
		//�������� ���� �����������̽� �ڷ����� ���Ե� �� �ִ�.
		List listTest=list;
		Collection collection=list2;
		
		//������ list�� �� �ֱ�
		//add()�żҵ带 �̿��ؼ� ���� �����Ѵ�. ->setter�� ���
		//������Ʈ���� ����ϴ� ��� Ÿ���� ������ �� �ִ�.
		list.add(false); //WrapperŬ���� ����ڽ�! ������ object�� �⺻�ڷ��� int,boolean�̿� ���� 
		list.add("������");
		list.add(19);
		list.add(180.5);
		list.add(new Date());   //Object��
		
		//List�ڷ����� ����Ҷ��� ��� vo��ü�� �����Ҷ� �����.
		//������ ����� Ŭ���� -> Student, Employee, Member
		ArrayList fruits=new ArrayList();
		fruits.add(new Fruit("���","����",5,30000));
		fruits.add(new Fruit("����","ü��",3,15000));
		fruits.add(new Fruit("����","���",8,10000));
		
		
		System.out.println(list); //�� ���� ���ʷ� ����, toString �������̵�� ","�����ؼ� ����(16����X) 
		//ArrayList�� �ִ� �� ����ϱ�
		//����ϴ� ��� : �� �����͸��� �ε����� �ο��Ǿ� �־� �ε����� �������� �����
		//get(�ε�����ȣ)�żҵ带 �̿�
		System.out.println(list.get(0)); //List[0] ->�迭�� �ٸ��� get��
		System.out.println(list.get(1)); //�ش� �ε����� ���
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		
		//for���� �̿��ؼ� ó������!
		//List�� �����͸� ������ Ȯ���ϱ� �Ϸ��� : size()�żҵ� �̿�
		System.out.println("list �����ͼ� : "+list.size());
		System.out.println("fruits �����ͼ� : "+fruits.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));//list������ ��ü��ȸ  ,�������ε� ���� toString�Ἥ����
		}
		
		//list�� �ִ� ������ ������ �����ϱ� ->get���� �������� ��簪 type Object�̱� ������
		//���� ���Ե� ��ü�� �̿��Ϸ��� ������ ����ȯ�� �ؾ���.
		//�������ε��� ����ɶ��� ���ص���.
		
		String name=(String)list.get(1);
		System.out.println(name);
		
		//List������ �����ϱ�
		//remove(index||��ü,�����Ͱ�)�żҵ带 �̿��ؼ� ����
		list.remove(0);
		System.out.println(list.get(0)); //������ 0������ ��ܼ� ����
		list.remove("������");
		System.out.println(list.get(0));//�������� �� ������ �����
		
		//List ������ �����ϱ�
		//set(index, �����ҵ�����) �żҵ� �̿�
		list.set(0, "���� �� ���½ð�");
		System.out.println(list.get(0));
		
		
		//List�� ���ϴ� ��ġ�� ������ �ֱ�
		//add(index,������) : �ε��� ��ġ�� �����͸� �߰� , �ڷδ� ��ĭ���и�
		System.out.println(list);
		list.add(1,"�̰��߰��Ѱ�!");
		System.out.println(list);
		
		//���� ���� ��ü�� �̿��غ���
		fruits.add(new Fruit("����","�ð�",8,20000));
		
		System.out.println(fruits); //toString�������̵� ���ؼ� �ּҰ� ����
		
		fruits.add(1,new Fruit("Ű��","��������",5,10000)); //1�� �ε��� �߰�
		System.out.println(fruits);
		
		//�����ϱ�
		fruits.remove(0);
		System.out.println(fruits);
		fruits.remove( new Fruit("Ű��","��������",5,10000) ); 
		//�����ؼ�����.. //equals �������̵� �ٽ� �����ؼ� ����� �ٲٰ� �������
		System.out.println(fruits);
		
		//�����ϱ�
		fruits.set(0, new Fruit("�ٳ���","�ʸ���",7,6000));
		System.out.println(fruits);
		
		//fruits���� -> ���ϵ��� �����ϱ� ���� ����
		//fruits.add(new Date());
		System.out.println(fruits);//���׸������� �ϸ� ������ �� ����!
		
		//list���� ����Ҹ��� �żҵ�
		//1. contains(��ü) : list���ο� �Ű������� ��ü�� �ִ��� �˷��ִ� �żҵ�
		//��ü�� equals()�������̵��� �Ǿ��־���� ����� ������.
		
		System.out.println(fruits.contains(new Fruit("����","�ʸ���",7,8000))); 
		if(!fruits.contains(new Fruit("����","�ʸ���",7,8000))) { //������ �߰��ϱ�
			fruits.add(new Fruit("����","�ʸ���",7,8000));
		}
		System.out.println(fruits);
		
		//2.clear() : list�� �ִ� �����͸� ��� ����� ��
		//fruits.clear();
		System.out.println(fruits); //�� ������
		
		//3.isEmpty() : List�� �����Ͱ� �ִ��� Ȯ��
		System.out.println(fruits.isEmpty());
		if(!fruits.isEmpty()) {
			for(int i=0;i<fruits.size();i++) {
				System.out.println(fruits.get(i));
			}
		}
		
		//4.indexOf(��ü) : ��ü�� ��ġ�ϴ� ���� �ε�����ȣ ��ȯ
		//����� -1�̸� ���� ��!
		System.out.println(list.indexOf(180.5));
		System.out.println(list);
		
		//5.toArray() : List�� Object[]�� ��ȯ���ִ� �żҵ�
		Object[] objs=list.toArray();//�żҵ� �̿�� �Ű������� �迭�� ������ ���
		
		//list�� �ߺ����� �����Ѵ�.
//		fruits.add(new Fruit("����","�ʸ���",7,8000));
//		fruits.add(new Fruit("����","�ʸ���",7,8000));
//		fruits.add(new Fruit("����","�ʸ���",7,8000));
//		fruits.add(new Fruit("����","�ʸ���",7,8000));
//		fruits.add(new Fruit("����","�ʸ���",7,8000));
//		fruits.add(new Fruit("����","�ʸ���",7,8000));
		System.out.println(fruits);
		
		//List�� ������ �ֱ� ������ ������ �����ϴ�.
		list.clear();
		for(int i=0;i<10;i++) {
			list.add((int)(Math.random()*10)+1);			
		}
		System.out.println(list);
		//list�� ������ �� �ִ� �żҵ带 ������ ����.
		//Collections.sort() : �̿��ϸ� ��.
		Collections.sort(list);//���ĳ�~ ������������!
		System.out.println(list);
		Integer i; //��Ŭ������ ������ compareTo�� sorting��
		
		list.clear();
		//list�� ���ڿ��� ��̸� �Է¹޾� ���� 5��
		
		Scanner sc=new Scanner(System.in);
		
//		for(int i=0;i<5;i++) {
//			System.out.print("��� : ");
//			list.add(sc.nextLine());
//		}
	        System.out.println(list);
	         Collections.sort(list);//������������
	        System.out.println(list);
		     //������ ��ü �����ϱ�
	        System.out.println("�����Ѱ�ü ����");
	        for(Object o : fruits) {
	        	System.out.println(o);
	        }
	        
	        Collections.sort(fruits);  //�׳� ���� �� ����!  compareTo�������ϸ� sort�Ҽ�����, 
	        //Ŭ�������� Comparable �������̽� implements�ϰ� compareTo��������
	        
	        //������ ��ü�� Collection.sort()�� �ϱ� ���ؼ��� ��ü�� Comparable�������̽��� 
	        //�����ؾ� �� -> compareTo()�żҵ带 ��������.
	        
	        System.out.println("������ ���");
	        for(Object o : fruits) {
	        	System.out.println(o);
	        }
		
	        //���Ĺ�� �ι�° ����Ŭ������ ���� �����ؼ� �����ϴ� ���
	        //Comparator�������̽��� �����ϴ� ��ü�� ����� ��.
	        //Collection.sort(����Ʈ, Comparator������ü);
	        Collections.sort(fruits,new FruitNameAscending());
		     System.out.println("Comparator�̿� ����ó��");
	        
	        for(Object o : fruits) {
	        	System.out.println(o);
	        };
	        //�̸��� �������� ������������
	        Collections.sort(fruits,new FruitNameDescending());
            System.out.println("Comparator�̿� �������� ����ó��");
	        
	        for(Object o : fruits) {
	        	System.out.println(o);
	        };
	        
	        //������ �������� ������������
	        Collections.sort(fruits,new FruitPriceAscending());
            System.out.println("Comparator�̿� �������� ����ó��");
	        
	        for(Object o : fruits) {
	        	System.out.println(o);
	        };
	        
	        //�ѹ��� ���Ǵ� ��ü�� ���� ó���ϱ� ���鋚..
	        //lambdaǥ���� ->������� �żҵ带 ǥ���ؼ� �ٷ� ������ �� �ְ� ���� �� 
	        //�żҵ��� ����θ� �����ϰ� ǥ���ؼ� �Ű������� �ѱ� �� ����.
	        //�������̽����� �Ѱ��� �żҵ常 ������ ������ ó��
	        Collections.sort(fruits,(Object o1, Object o2) 
	        		-> ((Fruit)o2).getPrice()-((Fruit)o1).getPrice());  //-> ���ٽ�ǥ��
	        
	        
	        	Collections.sort(fruits, new Comparator<Fruit>() {
	        		@Override
	        		public int compare(Fruit o1, Fruit o2) {
	        			return o2.getPrice()-o1.getPrice();
	        		}
	        	}  );
	        
	        
                System.out.println("Comparator�̿� ����ó��");
	        
	             for(Object o : fruits) {
	        	System.out.println(o);
	             } 
	             
	             //linkedList -> ArrayList�� ������
	             //�żҵ忡�� �ణ�� ���̰� ����.
	             
	             LinkedList linkList=new LinkedList();
	             linkList.add("������");
	             linkList.add("�����");
	             linkList.add("������");
	             linkList.add("�迹��");
	             
	             for(Object o : linkList) {
	            	 System.out.println(o);
	             }
	             for(int j=0;j<linkList.size();j++) {
	            	 System.out.println(linkList.get(j));
	             }
	        
	             System.out.println(linkList.getFirst());
	             System.out.println(linkList.getLast());
	             System.out.println(linkList.pop());
	             System.out.println(linkList);
	             
	             
	}
	
	

}
