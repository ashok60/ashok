package customerdemo.entities;

import customerdemo.Account;
import customerdemo.Customer;

public class RegularCustomer  extends Customer  {
	private String homeAddress;
	public RegularCustomer(String CustomerId, String name, Account account, String homeAddress ) {
		super (CustomerId,name,account);
		this.homeAddress = homeAddress;
	}
	public String gethomeAddress() {
		return homeAddress;
		
	}
	public void sethomeAddress(String homeAddress) {
		this.homeAddress=homeAddress;
	}

	}