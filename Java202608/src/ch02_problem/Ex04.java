package ch02_problem;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		int n1 = sc1.nextInt();
		int n2 = sc1.nextInt();
		int n3 = sc1.nextInt();
		
		//중간값을 저장할 변수
		int median=0;
		
		if( (n1>=n2 && n1<=n3) || (n1>=n3 && n1<=n2)) { //n1이 중간일 경우
			median = n1;
		}
		else if((n2>=n1 && n2<=n3) || (n2>=n3 && n2<=n1)) { //n2이 중간일 경우
			median = n2;
		}
		else if((n3>=n1 && n3<=n2) || (n3>=n2 && n3<=n1)) { //n3이 중간일 경우 
			median = n3;
		}

		System.out.println("중간 값은 "+ median +"");
		sc1.close();
	}
}








