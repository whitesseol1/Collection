package com.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.collection.model.vo.Fruit;

public class SetTest {

	public static void main(String[] args) {
		//Set : ��ü���� ������ �� �ִ� ���屸��
		// ������ ����, �ߺ����� �������� �ʴ´�.
		//���� ���ϴ°� get�� ����� ������ ����, iterator()����ؾ���
		
		HashSet set=new HashSet();
		
		//add() �żҵ带 �̿��ؼ� ���� ����
		set.add("������");
		set.add("������");
		set.add("������");
		set.add("�����");
        set.add("�迹��");
        
        //set�� ����Ǿ��ִ� ���� ����ϱ� ���ؼ���
        //��θ� ������ ����� �ؾ���. Ư������ �����ؼ� ���� �� ����!
		//Iterator��ü�� �̿��ؼ� ����� ��. -> ����ϴ� ����� StringTokenizer�� ����ϴ�.
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			//System.out.println(it.next()); //���� �� ��� NoSuchElementException ����
			
		}
		
		//������ �����ϳ� �����Ұ���
		
		//�ߺ����� �������� ����
		set.add("�����");
		set.add("�����");
		set.add("�����");
		set.add("�����");
		set.add("�����");
		set.add("�����");
		set.add("�����");
		set.add("�����");
		set.add("�����");
		set.add("�����");
		
		System.out.println("����� ���� �ִ�?");
        Iterator it2=set.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
        
        it2=set.iterator();//���Ҵ�, ������  �ѹ� ����ϸ� ������� �ٽ� �����ʿ�
		System.out.println(it2.next()); //������ �ϳ���..
		System.out.println(it2.next());
		//set�� �̿��ؼ� �ߺ��� �����ϱ�
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		
		System.out.println(list);
		HashSet temp=new HashSet(list);
		list=new ArrayList(temp);
		System.out.println(list);
		
		//lotto�����
		list.clear();
		while(list.size()!=6) {
			list.add((int)(Math.random()*44)+1);
			HashSet s=new HashSet(list);
			list=new ArrayList(s);
		}
		System.out.println(list);
		
		//��������� �����ϴ� set
		LinkedHashSet lset=new LinkedHashSet();
		
		lset.add(1);
		lset.add("������");
		lset.add(new Fruit("��","����",10,12000));
		
		System.out.println(lset);
		it2=lset.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		//treeSet  //������������ ������ ����
		TreeSet tset=new TreeSet();
//		tset.add("������");
//		tset.add("�����");
//		tset.add("������");
//		tset.add("�赿��");
		
		
		Iterator it3=tset.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		tset=new TreeSet();
		tset.add(1);
		tset.add(5);
		tset.add(3);
		tset.add(4);
		tset.add(2);
		tset.add(2);
		tset.add(2);
		
		it3=tset.descendingIterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		HashSet fruits=new HashSet();
		fruits.add(new Fruit("������", "õ��",5,5000));//Object�� �ڽİ�ü�� ����ȯ�ʿ�
		fruits.add(new Fruit("ü��","�̱�",3,12000));
		fruits.add(new Fruit("ü��","�̱�",3,12000));//equals�� �Ⱦ��� hashcode�� �� ���ؼ� ������ �� ����
		//hashcode �������̵��ϸ� ���� �ߺ��� �ȳ���
		
		it3=fruits.iterator();
		while(it3.hasNext()) { //hasNext() - ���� �ִ��� Ȯ��
			
//			System.out.println(((Fruit)it3.next()).getName()); //�ٸ� ���� �� ����, next()�������ٳ���
//			System.out.println(((Fruit)it3.next()).getName());
			Fruit f=(Fruit)it3.next();
			System.out.println(f.getName()+" "+f.getPrice());
			
			
		}
		
	}
	
	
}
