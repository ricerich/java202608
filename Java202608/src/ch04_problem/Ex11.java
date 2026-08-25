package ch04_problem;

import java.util.Scanner;

class Add
{
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a+b;
	}
}

class Sub
{
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a-b;
	}
}

class Mul
{
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a*b;
	}
}

class Div
{
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		int c = 0;
		try {
			c = a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌수 없어요!");
		}
		
		return c;
	}
}

public class Ex11 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하세요>>");
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		char op  = sc1.next().charAt(0);
		
		switch(op)
		{
			case '+':
				Add obj1 = new Add();
				obj1.setValue(a, b);
				System.out.println(obj1.calculate());
				break;
			case '-':
				Sub obj2 = new Sub();
				obj2.setValue(a, b);
				System.out.println(obj2.calculate());
				break;
			case '*':
				Mul obj3 = new Mul();
				obj3.setValue(a, b);
				System.out.println(obj3.calculate());
				break;
			case '/':
				Div obj4 = new Div();
				obj4.setValue(a, b);
				System.out.println(obj4.calculate());
				break;
				
			default :
				System.out.println("부호를 잘못 입력하셨어요!");
		}
	}

}








