package ch07_ploblem;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		ArrayList<Character> al = new ArrayList<Character>();
		
		//1. 값을 넣기
		System.out.print("빈 칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F)>>");
		for(int i=0; i<5; i++) {
			String s1 = sc1.next();
			
			char c1 = s1.charAt(0);
			
			al.add(c1);
		}
		
		double score = 0.0;
		
		//2.값을 꺼내서, 매칭된 점수로!
		for(int i=0; i<al.size(); i++) {
		
			char c1 = al.get(i);
			
			switch(c1)
			{
			case 'A':
				score=4.0;
				break;
			case 'B':
				score=3.0;
				break;
			case 'C':
				score=2.0;
				break;
			case 'D':
				score=1.0;
				break;
			case 'F':
				score=0.0;
				break;
			}
			
			System.out.println("점수는" + score);
			
		}
		

	}

}






