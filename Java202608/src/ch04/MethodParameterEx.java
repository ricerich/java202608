package ch04;


class A {
	int x;
}

public class MethodParameterEx {

	static void f1(int x) {
		x++;
		System.out.println("f1함수안의 x의 값은= " + x);
	}
	
	static void f2(int arr[]) {
		arr[0]++;
		System.out.println("f2함수안의 arr[0]의 값은= " + arr[0]);
	}
	
	static void f3(A a1) {
		a1.x++;
		System.out.println("f3함수안의 a1.x의 값은= " + a1.x);
	}
	
	
	public static void main(String[] args) 
	{
		//1.변수 ->  call by value(값) -> 복사
		int x = 10;
		f1(x);
		System.out.println("main()함수안의 x의 값은= " + x);
		System.out.println();
		
		//2.배열 -> call by reference(참조) -> 참조
		int arr[] = {10, 20, 30};
		f2(arr);
		System.out.println("main()함수안의 arr[0]의 값은= " + arr[0]);
		System.out.println();
				
		//3.객체 -> call by reference(참조) -> 참조
		A a1 = new A();
		a1.x = 10;
		f3(a1);
		System.out.println("main()함수안의 a1.x의 값은= " + a1.x);

	}

}








