package customerdemo.entities;

import customerdemo.Account;

public class Customer {
	 
		private String CustomerId;
		private String name;
		private Account account;
		
		public Customer (String CustomerId, String name) {
		this.CustomerId=CustomerId;
		this.name =name;
		}
		public Customer (String CustomerId, String name, Account account) {
			this(CustomerId,name);
			this.account =account;
		}
		public String getCustomerId() {
			
			return CustomerId;
		}
			public void setCustomerId(String CustomerId) {
				this.CustomerId =CustomerId;
			
		}
			public String getName() {
				return name;
				
			}
			public void setName(String name) {
				this.name = name;
				
			}
			public Account getAccount() {
				return account;
			}
			public void setAccount(Account account) {
				this.account =account;
				
			}
				
			}
		
		


