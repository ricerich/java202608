package ch03_problem;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>>");
		int n = sc1.nextInt();
		
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
		
		
	}

}
