package ch03_problem;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		String[] com = {"가위", "바위", "보"};
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("컴퓨터와 가위,바위,보 게임을 합니다!");
		
		//1. 사용자로 부터 가위,바위, 보를 입력 받는다.
		while(true) {
			
			System.out.print("가위,바위,보!>>");
			String user = sc1.next();
			
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
			}
			
			//2. 컴퓨터의 가위,바위,보를 랜덤으로 만든다.	
			int n = (int)(Math.random() * 3);
			
			String com1 = com[n];
			
			System.out.print("사용자는 "+user+", 컴퓨터는 "+com1+",");
			
			//3. 사용자와 컴퓨터의 가위바위보 승부를 계산하다.
			if(user.equals("가위"))//사용자 가위일때
			{
				if(com1.equals("가위"))//사용자 가위일때
					System.out.println("비겼습니다.");
				else if(com1.equals("바위"))//사용자 바위일때
					System.out.println("컴퓨터가 이겼습니다.");
				else if(com1.equals("보"))//사용자 보일때
					System.out.println("사용자 이겼습니다.");
			}
			else if(user.equals("바위"))//사용자 바위일때
			{
				if(com1.equals("가위"))//사용자 가위일때
					System.out.println("사용자 이겼습니다.");
				else if(com1.equals("바위"))//사용자 바위일때
					System.out.println("비겼습니다.");
				else if(com1.equals("보"))//사용자 보일때
					System.out.println("컴퓨터가 이겼습니다.");
			}
			else if(user.equals("보"))//사용자 보일때
			{
				if(com1.equals("가위"))//사용자 가위일때
					System.out.println("컴퓨터가 이겼습니다.");
				else if(com1.equals("바위"))//사용자 바위일때
					System.out.println("사용자 이겼습니다.");
				else if(com1.equals("보"))//사용자 보일때
					System.out.println("비겼습니다.");
			}
		}
		

	}

}







