package ch07_ploblem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex06 {

	public static void main(String[] args) 
	{
		
		HashMap<String, Integer> map = new HashMap<String, Integer>() ;
		
		Scanner sc1 = new Scanner(System.in);
		
		 System.out.println("****포인트 관리 프로그램");

		 
		 //1. 이름과 포인트 입력 ->해시맵에
		while(true) {
			
			System.out.print("이름과 포인트 입력>>");
			String name = sc1.next();
			
			if(name.equals("exit")){
				System.out.println("종료합니다");
			}
			
			int point = sc1.nextInt();
			
			//2.포인트를 누적시킨다.
			// 키값으로 원래 포인트를 가져온다. 그다음 현재 포인트를 합산한다. 다시 넣는다
			Integer point_old = map.get(name);
			
			if(point_old != null) {
				point = point + point_old;
			}
			
			map.put(name, point);
			
			Set<String> keys = map.keySet();
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()) {
				name = it.next();
				point = map.get(name);
				
				System.out.print("("+name+", "+point+")");				
			}
			System.out.println();
		}
		 
		
	}

}










