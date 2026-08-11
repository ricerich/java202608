package ch03_problem;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요>>");
		
		int money = sc1.nextInt();		
		int count = 0;
		
		int[] unit = {50000,10000,5000, 1000,500,100,50,10,1};

		for(int i=0; i<unit.length; ++i)
		{
			count = money / unit[i];		
			money = money % unit[i];
			
			if(count > 0)
				System.out.println(unit[i]+" 원권 "+ count +"개");
		}
	}

}
