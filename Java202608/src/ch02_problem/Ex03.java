package ch02_problem;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요>>");
		
		int money = sc1.nextInt();		
		int count = 0; 
		
		count = money / 50000;		
		money = money % 50000;
		
		if(count > 0)
			System.out.println("5만원권 "+ count +"매");
		
		count = money / 10000;		
		money = money % 10000;
		
		if(count > 0)
			System.out.println("1만원권 "+ count +"매");
		
		count = money / 1000;		
		money = money % 1000;
		
		if(count > 0)
			System.out.println("1천원권 "+ count +"매");
		
		count = money / 500;		
		money = money % 500;
		
		if(count > 0)
			System.out.println("5백원짜리 "+ count +"개");
		
		count = money / 100;		
		money = money % 100;
		
		if(count > 0)
			System.out.println("백원짜리 "+ count +"개");
		
		count = money / 50;		
		money = money % 50;
		
		if(count > 0)
			System.out.println("50원짜리 "+ count +"개");
		
		count = money / 10;		
		money = money % 10;
		
		if(count > 0) 
			System.out.println("10원짜리 "+ count +"개");

	}

}








