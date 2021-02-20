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
		//ArrayList는 배열과 동일한 저장방식을 가지고 있으며
		//배열의 단점을 보완한 자료구조형태이다.
		//클래스로 되어있어 매소드를 이용하여 데이터를 수정, 삭제, 추가할 수 있다.
		ArrayList list=new ArrayList();//클래스기 때문에 이용하기 위해서는 반드시 생성
		//default로 10개의 저장공간이 확보(배열)
		//저장공간을 지정해서 생성할 수 있음
		ArrayList list2=new ArrayList(20); //20개 공간
		//데이터를 object[]로 저장
		
		
		//다형성에 의해 구현인터페이스 자료형에 대입될 수 있다.
		List listTest=list;
		Collection collection=list2;
		
		//생성된 list에 값 넣기
		//add()매소드를 이용해서 값을 대입한다. ->setter랑 비슷
		//프로젝트에서 사용하는 모든 타입을 저장할 수 있다.
		list.add(false); //Wrapper클래스 오토박싱! 원래는 object에 기본자료형 int,boolean이용 못함 
		list.add("유병승");
		list.add(19);
		list.add(180.5);
		list.add(new Date());   //Object형
		
		//List자료형을 사용할때는 통상 vo객체를 저장할때 사용함.
		//데이터 저장용 클래스 -> Student, Employee, Member
		ArrayList fruits=new ArrayList();
		fruits.add(new Fruit("사과","영주",5,30000));
		fruits.add(new Fruit("포도","체코",3,15000));
		fruits.add(new Fruit("딸기","논산",8,10000));
		
		
		System.out.println(list); //값 넣은 차례로 나옴, toString 오버라이드로 ","구분해서 나옴(16진법X) 
		//ArrayList에 있는 값 출력하기
		//출력하는 방법 : 각 데이터마다 인덱스가 부여되어 있어 인덱스를 기준으로 출력함
		//get(인덱스번호)매소드를 이용
		System.out.println(list.get(0)); //List[0] ->배열과 다르게 get씀
		System.out.println(list.get(1)); //해당 인덱스값 출력
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		
		//for문을 이용해서 처리하자!
		//List의 데이터를 갯수를 확인하기 하려면 : size()매소드 이용
		System.out.println("list 데이터수 : "+list.size());
		System.out.println("fruits 데이터수 : "+fruits.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));//list데이터 전체순회  ,동적바인딩 적용 toString써서나옴
		}
		
		//list에 있는 데이터 변수에 저장하기 ->get으로 가져오는 모든값 type Object이기 때문에
		//실제 대입된 객체로 이용하려면 강제적 형변환을 해야함.
		//동적바인딩이 적용될때는 안해도됨.
		
		String name=(String)list.get(1);
		System.out.println(name);
		
		//List데이터 삭제하기
		//remove(index||객체,데이터값)매소드를 이용해서 삭제
		list.remove(0);
		System.out.println(list.get(0)); //지워서 0번으로 당겨서 들어가짐
		list.remove("유병승");
		System.out.println(list.get(0));//지워지고 또 앞으로 당겨짐
		
		//List 데이터 수정하기
		//set(index, 수정할데이터) 매소드 이용
		list.set(0, "이제 곧 쉬는시간");
		System.out.println(list.get(0));
		
		
		//List의 원하는 위치에 데이터 넣기
		//add(index,데이터) : 인덱스 위치에 데이터를 추가 , 뒤로는 한칸씩밀림
		System.out.println(list);
		list.add(1,"이건추가한것!");
		System.out.println(list);
		
		//내가 만든 객체를 이용해보기
		fruits.add(new Fruit("수박","시골",8,20000));
		
		System.out.println(fruits); //toString오버라이드 안해서 주소값 나옴
		
		fruits.add(1,new Fruit("키위","뉴질랜드",5,10000)); //1번 인덱스 추가
		System.out.println(fruits);
		
		//삭제하기
		fruits.remove(0);
		System.out.println(fruits);
		fruits.remove( new Fruit("키위","뉴질랜드",5,10000) ); 
		//생성해서지움.. //equals 오버라이딩 다시 정의해서 동등비교 바꾸고 지우게함
		System.out.println(fruits);
		
		//수정하기
		fruits.set(0, new Fruit("바나나","필리핀",7,6000));
		System.out.println(fruits);
		
		//fruits변수 -> 과일들을 관리하기 위해 선언
		//fruits.add(new Date());
		System.out.println(fruits);//제네릭선언을 하면 관리할 수 있음!
		
		//list에서 사용할만한 매소드
		//1. contains(객체) : list내부에 매개변수의 객체가 있는지 알려주는 매소드
		//객체에 equals()오버라이딩이 되어있어야지 사용이 가능함.
		
		System.out.println(fruits.contains(new Fruit("망고","필리핀",7,8000))); 
		if(!fruits.contains(new Fruit("망고","필리핀",7,8000))) { //없으면 추가하기
			fruits.add(new Fruit("망고","필리핀",7,8000));
		}
		System.out.println(fruits);
		
		//2.clear() : list에 있는 데이터를 모두 지우는 것
		//fruits.clear();
		System.out.println(fruits); //다 지워짐
		
		//3.isEmpty() : List에 데이터가 있는지 확인
		System.out.println(fruits.isEmpty());
		if(!fruits.isEmpty()) {
			for(int i=0;i<fruits.size();i++) {
				System.out.println(fruits.get(i));
			}
		}
		
		//4.indexOf(객체) : 객체와 일치하는 값의 인덱스번호 반환
		//결과가 -1이면 없는 값!
		System.out.println(list.indexOf(180.5));
		System.out.println(list);
		
		//5.toArray() : List를 Object[]로 반환해주는 매소드
		Object[] objs=list.toArray();//매소드 이용시 매개변수에 배열로 선언한 경우
		
		//list는 중복값을 저장한다.
//		fruits.add(new Fruit("망고","필리핀",7,8000));
//		fruits.add(new Fruit("망고","필리핀",7,8000));
//		fruits.add(new Fruit("망고","필리핀",7,8000));
//		fruits.add(new Fruit("망고","필리핀",7,8000));
//		fruits.add(new Fruit("망고","필리핀",7,8000));
//		fruits.add(new Fruit("망고","필리핀",7,8000));
		System.out.println(fruits);
		
		//List는 순서가 있기 때문에 정렬이 가능하다.
		list.clear();
		for(int i=0;i<10;i++) {
			list.add((int)(Math.random()*10)+1);			
		}
		System.out.println(list);
		//list를 정렬할 수 있는 매소드를 제공을 해줌.
		//Collections.sort() : 이용하면 됨.
		Collections.sort(list);//정렬끝~ 오름차순정렬!
		System.out.println(list);
		Integer i; //이클래스가 구현한 compareTo로 sorting함
		
		list.clear();
		//list에 문자열로 취미를 입력받아 저장 5개
		
		Scanner sc=new Scanner(System.in);
		
//		for(int i=0;i<5;i++) {
//			System.out.print("취미 : ");
//			list.add(sc.nextLine());
//		}
	        System.out.println(list);
	         Collections.sort(list);//오름차순정렬
	        System.out.println(list);
		     //생성한 객체 정렬하기
	        System.out.println("생성한객체 정렬");
	        for(Object o : fruits) {
	        	System.out.println(o);
	        }
	        
	        Collections.sort(fruits);  //그냥 넣을 수 없음!  compareTo구현안하면 sort할수없음, 
	        //클래스에서 Comparable 인터페이스 implements하고 compareTo재정의함
	        
	        //생성된 객체로 Collection.sort()를 하기 위해서는 객체가 Comparable인터페이스를 
	        //구현해야 함 -> compareTo()매소드를 재정의함.
	        
	        System.out.println("정렬후 결과");
	        for(Object o : fruits) {
	        	System.out.println(o);
	        }
		
	        //정렬방법 두번째 정렬클래스를 새로 생성해서 적용하는 방법
	        //Comparator인터페이스를 구현하는 객체를 만들면 됨.
	        //Collection.sort(리스트, Comparator구현객체);
	        Collections.sort(fruits,new FruitNameAscending());
		     System.out.println("Comparator이용 정렬처리");
	        
	        for(Object o : fruits) {
	        	System.out.println(o);
	        };
	        //이름을 기준으로 내림차순정렬
	        Collections.sort(fruits,new FruitNameDescending());
            System.out.println("Comparator이용 내림차순 정렬처리");
	        
	        for(Object o : fruits) {
	        	System.out.println(o);
	        };
	        
	        //가격을 기준으로 오름차순정렬
	        Collections.sort(fruits,new FruitPriceAscending());
            System.out.println("Comparator이용 오름차순 정렬처리");
	        
	        for(Object o : fruits) {
	        	System.out.println(o);
	        };
	        
	        //한번만 쓸건대 객체를 만들어서 처리하기 힘들떄..
	        //lambda표현식 ->방식으로 매소드를 표현해서 바로 실행할 수 있게 만든 것 
	        //매소드의 선언부를 간단하게 표시해서 매개변수로 넘길 수 있음.
	        //인터페이스에서 한개의 매소드만 선언한 것으로 처리
	        Collections.sort(fruits,(Object o1, Object o2) 
	        		-> ((Fruit)o2).getPrice()-((Fruit)o1).getPrice());  //-> 람다식표현
	        
	        
	        	Collections.sort(fruits, new Comparator<Fruit>() {
	        		@Override
	        		public int compare(Fruit o1, Fruit o2) {
	        			return o2.getPrice()-o1.getPrice();
	        		}
	        	}  );
	        
	        
                System.out.println("Comparator이용 정렬처리");
	        
	             for(Object o : fruits) {
	        	System.out.println(o);
	             } 
	             
	             //linkedList -> ArrayList와 동일함
	             //매소드에서 약간의 차이가 있음.
	             
	             LinkedList linkList=new LinkedList();
	             linkList.add("유병승");
	             linkList.add("김상현");
	             linkList.add("정유정");
	             linkList.add("김예진");
	             
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
