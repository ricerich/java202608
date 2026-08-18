package ch04_problem;

import java.util.Scanner;

class Circle
{
	private double x, y;	
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}


	public void show() {
		System.out.println("("+x+","+y+") "+radius);
	}


	public int getRadius() {
		return radius;
	}
	
}


class CircleManager{
	public void run() {
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];//객체 배열
		
		for(int i=0;i<c.length;i++) {//입력용
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			
			c[i] = new Circle(x, y, radius);
		}
		
//		for(int i=0;i<c.length;i++) {//출력용
//			c[i].show();			
//		}
		
		//배열 중에서 반지름 최대값 찾기
//		int max = 0;
//		int max_index = 0;
//		for(int i=0;i<c.length;i++) {//최대값 찾기용
//			if(max < c[i].getRadius()) {
//				max = c[i].getRadius();
//				max_index = i;
//			}
//		}
		
//		int max = 0;
		int max_index = 0;
		for(int i=0;i<c.length;i++) {//최대값 찾기용
			if(c[max_index].getRadius() < c[i].getRadius()) {
//				max = c[i].getRadius();
				max_index = i;
			}
		}
		
		c[max_index].show();
		
	}
}

public class Ex05 {

	public static void main(String[] args) 
	{
		new CircleManager().run();

	}

}
