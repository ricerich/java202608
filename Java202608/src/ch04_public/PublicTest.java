package ch04_public;

public class PublicTest 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
//		p1.age = 20;
		p1.setAge(20);
		
//		p1.name = "홍길동";
		
		
		
		int age = p1.getAge();
		System.out.println("너의 나이는="+age);
		
//		p1.printName(); //private 메소드라서 못씀!
	
		
	}

}



