package booklist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookStore 
{
//	private Connection con; // 멤버변수
//	private Statement stmt;
//	private ResultSet rs;
	
	private Book books[];
	
//	private Customer customer[];
	private ArrayList<Customer> customers;
	
	public BookStore() 
	{
		books = new Book[10];
		
		customers = new ArrayList<Customer>();
	}
	
	public Book[] getBooks()
	{
		return books;
	}
	
	public ArrayList<Customer> getCustomers() 
	{
		return customers;
	}
	

//	public void getConnection() {
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String userid = "madang"; // c##추가
//		String pwd = "madang"; // c##추가
//
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("드라이버 로드 성공");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		try {
//			System.out.println("데이터베이스 연결 준비 .....");
//			con = DriverManager.getConnection(url, userid, pwd);
//			System.out.println("데이터베이스 연결 성공");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
	
//	public void closeCon() throws SQLException {
//		con.close();
//	}

	public void getBookList() throws Exception { 
		
		String query = "SELECT * FROM book";
		
		try(Connection con = DBUtil.getConnection();
	        PreparedStatement ps = con.prepareStatement(query);
	        ResultSet rs = ps.executeQuery()) {
//			stmt = con.createStatement(); // 2
//			rs = stmt.executeQuery(query); // 3
			System.out.println("BOOK ID \tBOOK NAME \t\tPUBLISHER \t\t\tPRICE");
			
			int index=0;
			while (rs.next()) {
				
				int bookid = rs.getInt(1);
				String bookname = rs.getString(2);
				String publisher = rs.getString(3);
				int price = rs.getInt(4);
				
				books[index] = new Book(bookid, bookname, publisher, price);
				index++;

			}
//			con.close();
		} 
//		catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
	}
	
	public void getCustomerList() throws Exception { // 생성자
		
		String query = "SELECT * FROM customer";
		
		try (Connection con = DBUtil.getConnection();
	         PreparedStatement ps = con.prepareStatement(query);
	         ResultSet rs = ps.executeQuery())		
		    {
//			stmt = con.createStatement(); // 2
//			rs = stmt.executeQuery(query); // 3
			System.out.println("고객아이디 - 고객 이름 - 주소 - 전화번호");
			while (rs.next()) {
				
				int custid 	   = rs.getInt("custid");
				String name	   = rs.getString("name");
				String address = rs.getString("address");
				String phone   =rs.getString("phone");
				
				Customer cust1 =new Customer(custid, name, address, phone); 
				customers.add(cust1);		
			}
//			con.close();
		} 
//		catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}

	}


}







