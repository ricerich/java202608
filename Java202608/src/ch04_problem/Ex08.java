package ch04_problem;

import java.util.Scanner;

class Phone {
	
	private String name;
	private String tel;
	
	public Phone(String name, String tel) 
	{
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
	
}

class PhoneBook 
{
	private Phone pArray[];
	private Scanner scanner;
	
	public PhoneBook()
	{
		scanner = new Scanner(System.in);
//		pArray = new Phone[size];
	}
	
	private void insert(int n) 
	{
		pArray = new Phone[n];
		for(int i=0; i<pArray.length; i++) {
			System.out.print("이름과 전화번호(빈칸없이)>>");
			String name = scanner.next();
			String tel = scanner.next();
			pArray[i] = new Phone(name, tel);
		}
		System.out.println("저장하였습니다.");
		
	}
	
	private void view() 
	{
		while(true) {
			System.out.print("검색할 이름>>");
			String name = scanner.next();
			
			if(name.equals("그만")) {
				System.out.println("종료합니다!");
				return;
			}
			
			int i=0;
			for(i=0; i<pArray.length; i++)
			{
//				if(pArray[i].getName().equals(name)))
				if(name.equals(pArray[i].getName())){
					System.out.print(pArray[i].getName()+"의 전화번호는 ");
					System.out.println(pArray[i].getTel()+" 입니다");	
					break;
				}
			}
			
			if(i==pArray.length) {
				System.out.println(name+"은 없습니다");
			}
		}
	}
	
	public void run() 
	{
		//1.인원수 받기
		//2.입력 - insert()
		//3.검색 - view()
		
		System.out.print("인원수>>");
		int n = scanner.nextInt();
		
		insert(n);
		
		view();
	}
}

public class Ex08 {

	public static void main(String[] args) {
		new PhoneBook().run();
	}

}
