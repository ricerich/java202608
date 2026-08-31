package booklist;

public class Book 
{
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;
	
	public Book(int bookid, String bookname, String publisher, int price) 
	{
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}
	
	public void printBook() {
		System.out.print(bookid + "\t");
		System.out.print(bookname + "\t");
		System.out.print(publisher + "\t");
		System.out.println(price);
	}
	
	
}







