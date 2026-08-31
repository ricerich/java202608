package booklist;

import java.sql.SQLException;

public class BookStoreManager 
{
	public void run() 
	{
		BookStore bs = new BookStore();
		
		bs.getConnection();
		bs.getBookList();//DB에서 가져와서 Java객체배열에 담기
		Book books[] = bs.getBooks();
		for(int i=0; i<books.length; i++) {
			books[i].printBook();
		}
		
		
		bs.getConnection();
		bs.getCustomerList();
		
	}
}
