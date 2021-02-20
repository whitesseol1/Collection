package com.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.collection.model.vo.Fruit;

public class SetTest {

	public static void main(String[] args) {
		//Set : 객체들을 저장할 수 있는 저장구조
		// 순서가 없고, 중복값을 저장하지 않는다.
		//내가 원하는걸 get을 사용해 얻을수 없음, iterator()사용해야함
		
		HashSet set=new HashSet();
		
		//add() 매소드를 이용해서 값을 넣음
		set.add("유병승");
		set.add("정유정");
		set.add("김태희");
		set.add("김상현");
        set.add("김예진");
        
        //set에 저장되어있는 값을 출력하기 위해서는
        //모두를 가져와 출력을 해야함. 특정값을 지정해서 빼올 수 없음!
		//Iterator객체를 이용해서 출력을 함. -> 출력하는 방식은 StringTokenizer와 비슷하다.
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			//System.out.println(it.next()); //다음 값 없어서 NoSuchElementException 에러
			
		}
		
		//저장은 가능하나 수정불가능
		
		//중복값을 저장하지 않음
		set.add("김상현");
		set.add("김상현");
		set.add("김상현");
		set.add("김상현");
		set.add("김상현");
		set.add("김상현");
		set.add("김상현");
		set.add("김상현");
		set.add("김상현");
		set.add("김상현");
		
		System.out.println("김상현 많이 있니?");
        Iterator it2=set.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
        
        it2=set.iterator();//재할당, 재지정  한번 사용하면 사라져서 다시 지정필요
		System.out.println(it2.next()); //위에꺼 하나만..
		System.out.println(it2.next());
		//set을 이용해서 중복값 제거하기
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		
		System.out.println(list);
		HashSet temp=new HashSet(list);
		list=new ArrayList(temp);
		System.out.println(list);
		
		//lotto만들기
		list.clear();
		while(list.size()!=6) {
			list.add((int)(Math.random()*44)+1);
			HashSet s=new HashSet(list);
			list=new ArrayList(s);
		}
		System.out.println(list);
		
		//저장순서를 유지하는 set
		LinkedHashSet lset=new LinkedHashSet();
		
		lset.add(1);
		lset.add("유병승");
		lset.add(new Fruit("배","나주",10,12000));
		
		System.out.println(lset);
		it2=lset.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		//treeSet  //오름차순으로 무조건 정렬
		TreeSet tset=new TreeSet();
//		tset.add("유병승");
//		tset.add("김상현");
//		tset.add("장혜린");
//		tset.add("김동규");
		
		
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
		fruits.add(new Fruit("복숭아", "천도",5,5000));//Object라 자식객체로 형변환필요
		fruits.add(new Fruit("체리","미국",3,12000));
		fruits.add(new Fruit("체리","미국",3,12000));//equals를 안쓰고 hashcode로 값 비교해서 같은값 또 나옴
		//hashcode 오버라이드하면 이제 중복값 안나옴
		
		it3=fruits.iterator();
		while(it3.hasNext()) { //hasNext() - 값이 있는지 확인
			
//			System.out.println(((Fruit)it3.next()).getName()); //다른 과일 것 섞임, next()쓸때마다날라감
//			System.out.println(((Fruit)it3.next()).getName());
			Fruit f=(Fruit)it3.next();
			System.out.println(f.getName()+" "+f.getPrice());
			
			
		}
		
	}
	
	
}
