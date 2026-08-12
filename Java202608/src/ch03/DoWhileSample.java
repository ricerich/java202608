package ch03;

public class DoWhileSample {
	public static void main(String[] args) {
		char x='a';
		
		do {
			System.out.print(x); // 문자 출력
			x=(char)(x+1); // 알파벳의 경우 1을 더하면 다음 문자의 코드 값
		} while(x<='z'); 
	}
}