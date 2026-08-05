package ch02_problem;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("연산>>");
		
		double a = sc1.nextDouble();
		String op = sc1.next();
		double b = sc1.nextDouble();
		
		double result=0;
		if(op.equals("+")){
			result = a+b;
		}
		else if(op.equals("-")){
			result = a-b;
		}
		else if(op.equals("*")){
			result = a*b;
		}
		else if(op.equals("/")){
			if(b==0) {
				System.out.println("0으로 나눌수 없어요!!");
				return;
			}
			
			result = a/b;
		}

		System.out.println(a+" "+op+" "+b+"의 계산결과는 "+result);
	}

}






