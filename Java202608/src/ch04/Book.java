package ch04;

public class Book {
	String title;
	String author;
	
	Book(){}

	public Book(String t) { // 생성자
		title = t;
		author = "작자미상";
	}

	public Book(String t, String a) { // 생성자
		title = t;
		author = a;
	}

}
