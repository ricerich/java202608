package ch04_problem;

import java.util.Scanner;

class Day 
{
	private String work; // 하루의 할 일을 나타내는 문자열

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

class MonthSchedule 
{	
	private int nDays;
	
	private Day days[];
	
	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		days = new Day[nDays];
		
		for(int i=0; i<days.length; i++)
		{
			days[i] = new Day();
		}
		
	}

	private void input() {
	}

	private void view() {
	}

	private void finish() {
		System.out.println("프로그램 종료을 종료합니다.");	
	}

	public void run() 
	{
		System.out.println("이번달 스케줄 관리 프로그램.");
		
		Scanner sc1 = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("할일(입력:1, 보기:2, 종료:3)>>");
			int option = sc1.nextInt();
					
			switch(option) 
			{
				case 1:
					input();
					break;
				case 2:
					view();
					break;
				case 3:
					finish();
					return;
				default :
					System.out.println("잘못 입력하셨어요!");
			}
			
		}
	}

}

public class Ex07 {

	public static void main(String[] args) {
		new MonthSchedule(30).run();
	}

}






