package ch03;

public class NestedLoop {
	public static void main(String[] args) 
	{
		for(int i=2; i<=9; i++) 
		{ 
			for(int j=1; j<10; j++) { 
				System.out.print(i + "*" + j + "=" + i*j); // 구구셈 출력
				System.out.print('\t'); // 하나씩 탭으로 띄기
			}
			System.out.println(); // 한 단이 끝나면 다음 줄로 커서 이동
		}
	}
}
