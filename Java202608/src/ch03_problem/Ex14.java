package ch03_problem;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) 
	{
		//4. 그전에 과목 배열, 점수 배열 선언
		String[] course = {"Java","C++","HTML5","컴퓨터 구조","안드로이드"};
		int[]    score  = {95, 88, 76, 62, 55};
		
		while(true) {
			//1. 과목을 입력받는다. 횟수를 알수 없다 -> WHILE
			
			Scanner sc1 = new Scanner(System.in);
			System.out.print("과목 입력>>");
			String name = sc1.next();
			
			//2. 종료조건을 우선 넣는다. 예) "그만" 이라고 입력시, 횟수를 모를때 나오려면,
			if(name.equals("그만")) {
				break;
			}
			
			//3. 과목명에 해당하는 점수를 알아낸다. 배열 매칭 검사로
			int i=0;
			for(i=0; i<course.length; i++) {
//				if(name.equals(course[i])) 
				if(course[i].equals(name))
				{//입력 과목을 배열에서 찾는다.
					System.out.println(name+"의 점수는 "+ score[i]);
					break;
				}
			}
			
			if(i==course.length) {//배열을 다 돌고 나왔는데 찾는게 없어요!
				System.out.println("없는 과목이예요!");
			}
		}

	}

}





