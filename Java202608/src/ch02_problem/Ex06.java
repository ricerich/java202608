package ch02_problem;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("1~99사이의 정수 입력(10~99)>>");
		int n = sc1.nextInt();
		
		if(n<1 || n>99) {
			System.out.println("1~99 사이의 두 자리수를 입력해주세요!");
			return;
		}
		
		int ten = n / 10;
		int one = n % 10;
		
		int cnt = 0;		
		if(ten==3 || ten==6 || ten==9) {
			cnt++;
		}
		
//		if(one==3 || one==6 || one==9) {
		if(one%3 == 0 && one != 0 ) {
			cnt++;
		}
		
		if(cnt == 2) {
			System.out.println("박수짝짝");
		}
		else if(cnt == 1) {
			System.out.println("박수짝");
		} 
		else {
			System.out.println("박수없음");
		} 
	}
}
