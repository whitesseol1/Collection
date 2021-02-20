package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Fruit;

//Fruit객체이름을 정렬하게하는 sort객체
//Fruit객체 이름을 기준으로 +,-,0을 반환하는 매소드를 구현
//Comparator인터페이스를 구현해서 처리

public class FruitNameAscending implements Comparator<Fruit>{

	
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.getName().compareTo(o2.getName());
		
		//return o2.getName().compareTo(o1.getName());
	}
	
	

	
	
	
}
