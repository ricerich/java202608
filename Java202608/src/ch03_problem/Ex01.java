package ch03_problem;

public class Ex01 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0; i<100; i=i+2) 
		{
			sum = sum +i;
		}
		System.out.println(sum);
		
		int j=0;
		sum =0;
		do {
			if(j>=99)
				break;
			
			sum = sum + j;
			j = j + 2;
		}while(true);
		System.out.println(sum);
	}

}
