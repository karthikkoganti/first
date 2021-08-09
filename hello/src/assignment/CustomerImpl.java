package assignment;
import java.util.*;
class Customer implements Comparable<Customer>
{
	
	int custid;
	String custname;
	String emailId;

Customer(int custid, String custname, String emailId) 
{
	
	this.custid = custid;
	this.custname = custname;
	this.emailId = emailId;
}
public int compareTo(Customer cust)
{
	if(custid==cust.custid)
		return 0;
	else
		return-1;
}


 class CustomerImpl {
	 public static void main(String[] args)
		{
		ArrayList<Customer>custlist=new ArrayList<Customer>();
		custlist.add(new Customer(160040409,"Karthik","karthikkoganti73@gmail.com"));
		custlist.add(new Customer(18,"Virat","Virat18@gmail.com"));
		
		Collections.sort(custlist);
		for(Customer cust:custlist) {
			System.out.println(cust.custid+""+cust.custname+""+cust.emailId);
		}
	
		

	
}
}

}
