package ch05_problem;

import java.util.Scanner;

abstract class Calc
{
	protected int a;
	protected int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract int calculate();
}

class Add extends Calc{
	@Override
	public int calculate() {
		return a+b;
	}
}

class Sub extends Calc{
	@Override
	public int calculate() {
		return a-b;
	}
}

class Mul extends Calc{
	@Override
	public int calculate() {
		return a*b;
	}
}

class Div extends Calc{
	@Override
	public int calculate() {
		return a/b;
	}
}

public class Ex11 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하세요>>");
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		char op  = sc1.next().charAt(0);
		
		Calc calc=null;
		switch(op)
		{
			case '+':
				calc = new Add();
				break;
			case '-':
				calc = new Sub();
				break;
			case '*':
				calc = new Mul();
				break;
			case '/':
				calc = new Div();
				break;
				
			default :
				System.out.println("부호를 잘못 입력하셨어요!");
		}
		
		calc.setValue(a, b);
		
		if(calc instanceof Div && b==0)
			System.out.println("0으로 나눌 수 없어요!");
		else
			System.out.println(calc.calculate());

	}
}







