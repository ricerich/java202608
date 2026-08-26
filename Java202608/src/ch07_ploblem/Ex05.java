package ch07_ploblem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex05 {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>() ;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 5개 입력하세요.(예:korea 5000)");
		
		for(int i=0; i<5; i++)
		{
			System.out.print("나라 이름, 인구>>");
			String name = sc1.next();
			int count = sc1.nextInt();
			
			map.put(name, count);
		}
		
		//최대값 찾기... 우선적으로 키의 모든 이름을 알아야된다.
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		
		int max = 0; //인구수 최대
		String max_name = "";
		
		while(it.hasNext()) {
			String name = it.next();
			int count = map.get(name);
			
			if(count > max) {
				max = count;
				max_name = name;
			}
		}
		
		System.out.println("제일 인구가 많은 나라는 ("+max_name+", "+max+")");
		
	}

}





