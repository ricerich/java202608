package ch04;

public class Overview {

	public static void main(String[] args) 
	{
		//2.클래스 사용하기 //3.객체 만들기
		Car c1;//c1은 변수는, 변수인데 레퍼런스 변수, 객체(=object), 덜 된 객체(미생)
		c1 = new Car();// 
		
		//4.객체 사용하기
		c1.brand = "현대";
		c1.printSpec();
		
		Car c2 = new Car();
		c2.name = "아반떼";
		c2.brand = "기아차";
		c2.year = 2011;
		c2.printSpec();
				
	}

}
