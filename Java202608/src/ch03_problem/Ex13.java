package ch03_problem;

public class Ex13 {

	public static void main(String[] args) {
		
		//1. 1~99 반복을 한다
		//2. 1의 자리수와 10의 자리수를 구한다
		//3. 갯수를 구한다 1의 자리수의 3,6,9와 10의 자리의 3,6,9
		//4. 숫자와 박수짝짝을 출력한다.
		
		//1. 1~99 반복을 한다
		for(int i=1; i<=99; i++) {
			int ten = i / 10;
			int one = i % 10;
			
			int cnt = 0;
			
			if(ten ==3 || ten==6 || ten==9) {
				cnt++;
			}
			if(one ==3 || one==6 || one==9) {
				cnt++;
			}
			
			String str1[] = {"박수짝","박수짝짝"};
			
			if(cnt>0)
				System.out.println(i + str1[cnt-1]);

		
		}
		

	}

}







