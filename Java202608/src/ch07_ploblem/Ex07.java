package ch07_ploblem;

import java.util.ArrayList;
import java.util.Scanner;

class Location {
	
	private int x;
	private int y;

	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 두 객체 사이의 거리를 구하는 메소드
	 public double getDistance(Location loc)
	 {
		 double distance = Math.sqrt((this.x-loc.x)*(this.x-loc.x)+
				                     (this.y-loc.y)*(this.y-loc.y));
		 return distance;
	 }

	
	
}

public class Ex07 {

	public static void main(String[] args) 
	{
		ArrayList<Location> ar1 = new ArrayList<Location>();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("쥐가 이동한 위치 (x,y)를 5개 입력하시오>>");
		
		//시작위치 (0,0)
		ar1.add(new Location(0,0));
		
		for(int i=0; i<5; i++)
		{
			System.out.print(">>");
			int x = sc1.nextInt();
			int y = sc1.nextInt();
			
			ar1.add(new Location(x,y));
		}
		
		//종료위치 (0,0)
		ar1.add(new Location(0,0));
		
		double sum = 0.0;
		for(int i=0; i<ar1.size()-1; i++) {
			Location loc1 = ar1.get(i);
			Location loc2 = ar1.get(i+1);
			double distance = loc1.getDistance(loc2);
			
			sum = sum + distance;					
		}
		
		System.out.println("총 이동 거리는 "+(int)(sum*100)/100.0);

	}

}








