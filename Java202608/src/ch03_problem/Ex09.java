package ch03_problem;

public class Ex09 {

	public static void main(String[] args) 
	{
		
		//1. 4x4 의 크기를 갖는 2차원 배열 생성
		int arr1[][] = new int[4][4];
		
		//2. 배열안에 값넣기, 랜덤하게
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = (int)(Math.random() * 10 + 1);//1~10
			}
		}
		
		//3. 배열안의 값 출력
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
}







