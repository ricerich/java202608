package booklist;

public class Customer 
{
	private int custid;
	private String name;
	private String address;
	private String phone;
	
	public Customer(int custid, String name, String address, String phone) 
	{
		this.custid = custid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public void printCustomer()
	{
		System.out.printf("%-3d || %-6s || %-12s || %8s", custid, name, address, phone);
		System.out.println();
	}
	

}





