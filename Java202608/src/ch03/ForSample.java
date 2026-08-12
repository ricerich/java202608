package ch03;

public class ForSample 
{
	public static void main(String[] args) 
	{
		int i=0;
		int sum = 0;
		for (i = 1; i <= 10; i++) 
		{ 
			sum = sum + i;
			System.out.print(i); 
			
			if (i <= 9) 
				System.out.print("+");
			else { 
				System.out.print("="); // '=' 출력하고
				System.out.print(sum); // 덧셈 결과 출력
			}
		}
	}
}

