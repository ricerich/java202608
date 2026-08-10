package ch03_problem;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("알파벳 하나만 입력하세요>>");
		String s = sc1.next();
		char c = s.charAt(0);
		
		if(s.length() != 1) {
			System.out.println("한 글자만 입력하셔야 해요!");
			return;
		}
		
		if(c <'a' || c > 'z') {
			System.out.println("알파벳 소문자가 아닙니다!");
			return;
		}
		
		for(char i=c; i>='a'; i--) {
			for(char j='a'; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}





