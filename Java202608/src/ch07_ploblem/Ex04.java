package ch07_ploblem;

import java.util.Scanner;
import java.util.Vector;

public class Ex04 {

	public static void main(String[] args) 
	{
		Vector<Double> v = new Vector<Double>();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("2000~2009년까지 1년 단위의 키(cm) 입력");
		for(int i=0; i<10; i++)
		{
			double height = sc1.nextDouble();
			v.add(height);
		}
		
		int max_index =0;
		double max = 0.0;
		
		for(int i=0; i<v.size()-1 ; i++)
		{
			double diff = v.get(i+1) - v.get(i);
			
			if(diff > max) {
				max = diff;
				max_index = i;
			}
		}
		
		max = (int)(max*100)/100.0;
		
		System.out.println("가장 많이 키가 자란 연도는 "+(2000+max_index)+"년 "+max+" cm");

	}

}





