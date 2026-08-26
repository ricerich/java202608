package ch07_ploblem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) 
	{
		//1.해시맵 만들기
		//2.값넣기
		//3.키로 값꺼내기
		//4. 입력값을 키에 대입해서 찾는다.
		
		 HashMap<String, Integer> map = new HashMap<String, Integer>() ;
		 
		 map.put("에스프레소", 2000);
		 map.put("아메리카노", 2580);
		 map.put("카푸치노", 3000);
		 map.put("까페라테", 3500);
		 
		 Scanner sc1 = new Scanner(System.in);
		 
		 Set<String> keys = map.keySet();
		 Iterator<String> it = keys.iterator();
		 
		 while(it.hasNext()) {
			 String key = it.next();
			 System.out.print(key);
			 if(it.hasNext())
			 	System.out.print(",");
		 }
		 System.out.println("가 있습니다.");
		 
		 while(true)
		 {
			 System.out.print("주문>>");
			 String name = sc1.next();
			 
			 if(name.equals("그만")) {
				 System.out.println("종료합니다");
				 break;
			 }
			 
			 Integer price = map.get(name);
			 
			 if(price == null) {
				 System.out.println("그런 메뉴 없어요!");
			 }
			 else {
				 System.out.println(name+"는 "+price+"원 입니다.");
			 }
		 }
	}
}
















