package ch04_problem;

import java.util.Scanner;

class Dictionary 
{
	private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		return null;
	}
}
public class Ex10 
{
	public static void main(String[] args) 
	{
		System.out.println("한영 검색 프로그램입니다.");
		
		Scanner sc1 = new Scanner(System.in);
		while(true) {
			System.out.print("한글 단어?");
			String kor = sc1.next();
			if(kor.equals("그만")) {
				System.out.println("종료합니다!");
				break;
			}
						
			String eng = Dictionary.kor2Eng(kor);
			
			if(eng != null)
				System.out.println(""+kor+"는(은) "+ eng);
			else
				System.out.println(kor + "는 없는 단어입니다!");
		}
	}
}









