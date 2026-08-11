package ch03_problem;

public class Ex11 {

	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=0; i<args.length; i++) {
			sum =sum + Integer.parseInt(args[i]);// "10" -> 10
		}
		System.out.println(sum);

	}

}
