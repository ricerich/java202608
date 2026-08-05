package ch02_problem;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("원의 중심(x1,y1)과 반지름을 입력>>");
		double x1 = sc1.nextDouble();
		double y1 = sc1.nextDouble();
		double r = sc1.nextDouble();
		
		System.out.print("점(x2,y2)입력>>");
		double x2 = sc1.nextDouble();
		double y2 = sc1.nextDouble();
		
		double l = Math.sqrt(((x1-x2) * (x1-x2)) + ((y1-y2) * (y1-y2)));
		
		if(l < r) {
			System.out.println("점("+x2+", "+y2+")은 원 안에 있어요");
		}
		else
			System.out.println("점("+x2+", "+y2+")은 원 밖에 있어요");
		
	}

}
