package ch02_problem;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int c = sc1.nextInt();
		
//		//삼각형이 안되는 경우
//		if( (a+b)<c || (b+c)<a || (a+c)<b ) {
//			System.out.println("삼각형이 될수 없어요!");
//		}
//		else
//			System.out.println("삼각형이 되요!");
		
		//삼각형이 되는 경우
		if( (a+b)>c && (b+c)>a && (a+c)>b ) {
			System.out.println("삼각형이 되요!");
		}
		else
			System.out.println("삼각형이 될수 없어요!");
		
		sc1.close();
		
	}

}








