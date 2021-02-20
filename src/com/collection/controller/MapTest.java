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
		//map에 대해 알아보자.
		//쌍으로 이루어져있는 자료구조 key : value
		//key : Object / value : Object
		//Collection인터페이스를 상속받지 않음
		//Map인터페이스로 구성되어있음.
		
		HashMap map=new HashMap();
		//데이터 넣기
		//key value값 모두 대입해야함.
		//put(key,value) 매소드를 이용함
		//key : String, Integer를 많이 사용함.
		//value : vo(데이터보관용 객체)를 사용.
		map.put("유병승", 19);
		map.put("김상현", 29);
		map.put(1, "장혜린");
		map.put(2, "정유정");
		
		System.out.println(map); //입력순 아님, 순서없이출력
		
		//map에 저장된 데이터 가져오기
		//map에 저장된 데이터는 key값을 기준으로 가져옴.
		//key를 인덱스로 보면됨.
		System.out.println(map.get("유병승")); //key값을 가지고 value를 가져옴
		System.out.println(map.get("김상현"));
		
		//key값은 중복이 불가능, value중복이 가능
		System.out.println(map.get(1));
		map.put(1, "김동규");
		System.out.println(map.get(1)); //있는 key값에 집어넣으면 value값 덮어쓰게됨
		
		//값 삭제하기
		//remove(key값)매소드 이용 -> key값을 기준으로 삭제
		map.remove(1);
		System.out.println(map);
		
		System.out.println(map.size()); //크기 size로 파악할수있음
		
		//Map에 저장되어있는 전체 자료 조회하기
		//key를 기준으로 값을 가져옴.
		//1.key값을 확인하고 그 key값으로 데이터를 가져와야함
		//key Set방식으로 저장이 됨. -> Iterator를 사용해야함
		
//		Iterator it=map.keySet().iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next()); //key값이 출력됨
//		}
		
		Iterator it=map.keySet().iterator();
	
		while(it.hasNext()) {
			Object key=it.next();	
			Object value=map.get(key);
			System.out.println(key+":"+value); //value값이 출력됨
		}
		
		//Map.Entry를 이용해서 key, value값을 동시에 가져오는것
		Set entrySet=map.entrySet(); //Map.Entry클래스
		Iterator entry=entrySet.iterator();
		
		while(entry.hasNext()) {
			//it -> Map.Entry객체가 들어가 있음.
			Map.Entry e=(Map.Entry)entry.next();
			       //Object origin=((Fruit)e).getOrigin();
			//getKey() -> key값을 가져옴 / getValue() -> value
			System.out.println(e.getKey()+" : "+e.getValue());
			
		}
		
		//데이터가 있는지 확인
		System.out.println(map.isEmpty()); 
		
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue(29));
		
		//map을 이용하기
		map.clear();
		
		map.put(1, new Fruit("귤","제주도",10,15000));
		map.put(2, new Fruit("파인애플","필리핀",6,7000));
		map.put(3, new Fruit("레몬","미국",1,3000));
		
		//map에 있는 값의 이름, 원산지를 출력하기
		
		it=map.keySet().iterator();
		//set s=map.keySet();
		//it=s.iterator();
		
		while(it.hasNext()) {
			Object key=it.next();
			Fruit f=(Fruit)map.get(key);
			System.out.println(f.getName()+" "+f.getOrigin());
			
			
//			Object value=map.get(key);
//			Object origin=((Fruit)value).getOrigin();
//			System.out.println(key+":"+origin); //value값이 출력됨
//			
		}
		
		//Map.Entry이용해서 처리하기
		Set es=map.entrySet();//Map.Entry클래스
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
		data.put("name", "유병승");
		data.put("age", 19);
		data.put("address", "경기도 시흥시");
		data.put("userId", "admin");  //데이터 이런식으로 저장
		
		list.add(data);
		list.add(data);
		list.add(data);
		list.add(data);
		list.add(data);  //HashMap저장방식
		
		
		for(int i=0;i<list.size();i++) {
		   for(Object o : ((HashMap)list.get(0)).keySet()) {
			HashMap m=(HashMap)list.get(0);
			System.out.print(m.get(o)+" ");
		    }
		    System.out.println();
		   
		   
		}
	}
	
	
	

}
