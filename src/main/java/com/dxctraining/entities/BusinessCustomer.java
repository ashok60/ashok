package customerdemo.entities;

import customerdemo.Account;
import customerdemo.Customer;

public class BusinessCustomer extends Customer {
	private String businessAddress;
	public BusinessCustomer(String CustomerId, String name,  Account account,String businessAddress) {
		super (CustomerId,name,account);
		this.businessAddress = businessAddress;
	}
	public String getBusinessAddress() {
		return businessAddress;
		
	}
	public void setBusinessAddress(String businessAddress) {
		this.businessAddress=businessAddress;
	}
}
