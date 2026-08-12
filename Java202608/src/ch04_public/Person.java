package ch04_public;

public class Person
{
	private String name;
	private int age;
	
	public Person(){
		name = "아무개";
		age = 1;
		printName();
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		printName();
		return age;
	}
	
	private void printName()
	{
		System.out.println("너의 이름= " + name);
	}
	
}
