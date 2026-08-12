package ch04;

//1.클래스 만들기
//2.클래스 사용하기 //3.객체 만들기 -> main()메소드에서 사용
//4.객체 사용하기 -> main()메소드에서 사용

public class Car //1.클래스 만들기 
{
	//클래스 구성요소[멤버] 3가지, 만들기
	//1. 멤버 변수 [=field]
	//2. 생성자 (메소드) [=constructor]
	//3. (멤버) 메소드 [=method]
	
	//1. 멤버 변수 [=field] 만들기 
	String name;
	String brand;
	int 	year;
	
	//2. 생성자 (메소드) [=constructor]
	Car() //메소드 정의[=만들기]
	{
		//역할: 멤버변수를 초기화
		name="소나타";
		year=2026;
	}
	
	//3.메소드
	void printSpec()
	{
		System.out.println("이름: " + name);
		System.out.println("제조사: " + brand);
		System.out.println("연식: " + year);
	}	
}








