package com.collection.model.vo;

import java.util.Objects;

import com.collection.model.vo.Fruit;

public class Fruit implements Comparable<Fruit>{
	
	private String name;
	private String origin;
	private int sugarContent;
	private int price;
	
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	

	public Fruit(String name, String origin, int sugarContent, int price) {
		super();
		this.name = name;
		this.origin = origin;
		this.sugarContent = sugarContent;
		this.price = price;
	}
	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getSugarContent() {
		return sugarContent;
	}

	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Fruit [name=" + name + ", origin=" + origin + ", sugarContent=" + sugarContent + ", price=" + price
				+ "]";
	}
	
	//��ü�� ����񱳸� ����
	
	@Override
	public boolean equals(Object o) {
		
	    if(o instanceof Fruit) {
				Fruit f=(Fruit)o;		
		    if(name.equals(f.getName())
		    		&&origin.equals(f.getOrigin())&&
		    		sugarContent==f.getSugarContent()&&
		    		price==f.getPrice()) {      
		         return true;
		           }
			     }
			
			return false;		
		}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,origin,sugarContent,price);
	}
	
	
	
	
	@Override
	public int compareTo(Fruit f) {
		//�����̸����� �����ϱ�
		//�˾Ƽ� ���ľ˰����� ���� +, 0, -
		//+ : �ڸ�����
		//0 : ��������
		//- : ��������
		
		//return name.compareTo(f.name); �̸� ������������
		return f.name.compareTo(name); //�̸� �������� ����
		//return price-f.price; //- + 0 ���� ������ ����
		
		//return f.price-price;
		
//		if(price<f.price) {
//			return -1;		
//		}else if(price==f.price) {
//			return 0;
//		}else {
//			return  +1;
//		}   //��������, �������� ����
		
	}
	
	
	

}
