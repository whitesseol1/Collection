package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Fruit;

public class FruitPriceAscending implements Comparator<Fruit> { //클래스 생성할때 인터페이스추가 설정 가능

	
	
	//alt+s+v ->오버라이딩 구현 매소드
	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o1.getPrice()-o2.getPrice();
	}

	
	
	
}
