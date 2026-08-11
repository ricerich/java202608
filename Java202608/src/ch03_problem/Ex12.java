package ch03_problem;

public class Ex12 {

	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=0; i<args.length; i++) {
			
			try {
				sum =sum + Integer.parseInt(args[i]);// "10" -> 10
			}
			catch(NumberFormatException e) {
//				e.printStackTrace();
			}
			
		}
		System.out.println(sum);
	}

}
