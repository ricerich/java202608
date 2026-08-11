package ch03_problem;

import java.util.Scanner;

public class Ex08 
{
	public static void main(String[] args) 
	{
		
		//1.배열의 갯수를 입력 받는다.
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int size = sc1.nextInt(); 

		//2.100개 이하를 입력받는다.(예외처리)
		if(size<=0 || size>100) {
			System.out.println("1~100 사이를 입력해주세요");
			return;
		}
		
		//3.배열을 사이즈 만큼 생성하고
		int arr1[] = new int[size];
		
		//4.랜덤하게 입력한다.그런데 중복체크는?
		for(int i=0; i<arr1.length; i++)
		{
			//5.중복이 되면 다시 입력받는다.
			int n = (int)(Math.random() * 100 + 1);//1~100
			
			//6.기존에 입력받은 배열안의 값이, 지금 입력받은 값과 같은지 전부 확인
			for(int j=0; j<i; j++)//이전까지 입력받은 횟수 i
			{
				if(n == arr1[j]) {
					i--;
					break;
				}
				else
					arr1[i] = n;
			}
		}
		
		//7.배열안의 원소를 출력한다
		for(int i=0; i<arr1.length; i++)
		{
			if(i%10==0 && i!=0)
				System.out.println();
			
			System.out.print(arr1[i] +" ");
			
		}
		
	}
}













