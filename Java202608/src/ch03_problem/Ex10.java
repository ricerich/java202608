package ch03_problem;

public class Ex10 {

	public static void main(String[] args) 
	{

		//1. 4x4 2차원 배열을 생성한다.
		int arr1[][] = new int[4][4];
		
		//2. 배열에 0으로 값을 다 넣는다.
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = 0;
			}
		}
		
		//3. 배열에 10개만 값을 넣는다. 랜덤값(1~10)으로, 랜덤위치 arr1[0~3][0~3]에
		for(int i=0; i<10; i++) {
			int row = (int)(Math.random() * 4);
			int col = (int)(Math.random() * 4);
			
			if(arr1[row][col] == 0) {//0이 입력되어 있는곳에만 값입력
				arr1[row][col] = (int)(Math.random() * 10 + 1);
			}
			else {
				i--;//입력실패시 횟수를 돌린다.
			}
		}
		
		//4. 배열안의 값 출력
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

}








