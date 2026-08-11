package ch03_problem;

public class Ex07 {

	public static void main(String[] args) {
		
		//1. 10개 저장할 배열 준비
		int arr1[] = new int[10];

		//2. 배열 값 넣기(랜덤하게), 10번 반복
		for(int i=0; i<arr1.length; ++i) {
 			arr1[i] = (int)(Math.random() * 10 + 1);//1~10
		}
		
		//3. 배열 값 꺼내서 모든값 출력 
		for(int i=0; i<arr1.length; ++i) {
			if(i==0) {
				System.out.print("랜덤한 정수를 : ");
			}
			System.out.print(arr1[i]+" ");
		}
		
		//4. 배열 값 꺼내서 합계/갯수=평균 출력
		double sum = 0.0;
		for(int i=0; i<arr1.length; ++i) {
			sum = sum + arr1[i];
			
			if(i==arr1.length-1) {
				System.out.println();
				System.out.println("평균은 " + (sum/arr1.length));
			}
		}
	}

}









