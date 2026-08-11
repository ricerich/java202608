package ch03_problem;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		//1. 값을 저장할 배열만들기(변수, 배열)
		int arr1[] = new int[10];
		
		Scanner sc1 = new Scanner(System.in);
		
		//2. 정수 10개(반복) 입력받기
		System.out.print("양의 정수 10개를 입력하시오>>");
		for(int i=0; i<arr1.length; ++i) {
			arr1[i] = sc1.nextInt();
		}
		
		//3. 3의 배수 찾기
		System.out.print("3의 배수는 ");
		for(int i=0; i<arr1.length; ++i) {
			if(arr1[i]%3 ==0) {
				System.out.print(arr1[i] + " ");
			}
		}
	}

}














