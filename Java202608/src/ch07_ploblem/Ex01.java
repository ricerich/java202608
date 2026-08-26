package ch07_ploblem;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) 
	{
		//1.벡터를 만든다.(cf:배열을 만든다)
		//2.벡터에 값을 넣는다.반복 5회
		//3.벡터에 값을 꺼낸다.
		//4. 값을 꺼내긴 꺼내는데, 가장 큰 수 1개만 꺼낸다.
		
		Vector<Double> v = new Vector<Double>();
		
		Scanner sc1 = new Scanner (System.in);
		System.out.print("입력>>");
		for(int i=0; i<5; i++) {
//			double d = sc1.nextDouble();
//			v.add(d);
			v.add(sc1.nextDouble());
		}
		
		int max_index=0;		
		for(int i=0; i<v.size(); i++) {
			if(v.get(i) > v.get(max_index)) {
				max_index = i;
			}
		}
		
		System.out.println("가장 큰 수는 " + v.get(max_index));
		System.out.println("가장 큰 수의 위치는 "+ (max_index+1) +" 번째 입니다");

	}

}













