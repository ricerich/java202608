package ch03;


public class Method01 
{
	//0.메소드 만들기...
	
	//1.입력 O, 출력 O 만들기
	static int sum1(int a, int b) 
	{
		return a+b;
	}
	
	//2.입력 O, 출력 X 만들기
	static void sum2(int a, int b)//입력은 매개변수,매개인자,매개인수, parameter 
	{
		System.out.println("메소드2="+(a+b));
	}	
	
	//3.입력 X, 출력 O 만들기
	static int sum3() 
	{
		return 100;
	}
	
	//4.입력 X, 출력 X 만들기
	static void sum4()
	{
		System.out.println("메소드4=42222");
	}
	
	//5.입력 O, 출력 X 만들기, 배열을 입력으로
	static void sum5(int a[] ) 
	{
		int sum =0;
		for(int i=0; i<a.length; ++i) {
			sum = sum + a[i];			
		}
		
		System.out.println("메소드5="+sum);
		
	}
	
	//6.입력 O, 출력 O 만들기, 배열을 입력으로, 출력은 배열아님
	static int sum6(int a[] ) 
	{
		int sum =0;
		for(int i=0; i<a.length; ++i) {
			sum = sum + a[i];			
		}
		
		return sum;
	}
	
	
	//7.입력 O, 출력 O 만들기, 배열을 입력으로, 출력은 배열!!!
	static int[] sum7(int a[] ) 
	{
		for(int i=0; i<a.length; ++i) {
			a[i]++;			
		}
		
		return a;
	}
	
	
	public static void main(String[] args) 
	{
		//1.입력 O, 출력 O 사용하기
		int c = sum1(3,4);
		System.out.println("메소드1="+c);
		
		//2.입력 O, 출력 X 사용하기
		sum2(3,5);
		
		//3.입력 X, 출력 O 사용하기
		int d = sum3();
		System.out.println("메소드3="+d);
		
		System.out.println("메소드3="+sum3());
		
		//4.입력 X, 출력 X 사용하기
		sum4();
		
		//5.입력 O, 출력 X 사용하기, 입력을 배열(array)로
		int arr1[] = {10, 20, 33};
		sum5(arr1);
		
		int e = sum6(arr1);
		System.out.println("메소드6="+e);
		
		int f[] = sum7(arr1);
		for(int i=0; i<f.length; ++i) {
			System.out.println("메소드7="+f[i]);
		}
	}
}











