package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Fruit;

public class FruitNameDescending implements Comparator<Fruit>{

	
	@Override
	public int compare(Fruit f, Fruit f2) {
		return f2.getName().compareTo(f.getName());
	}
	
	
}
