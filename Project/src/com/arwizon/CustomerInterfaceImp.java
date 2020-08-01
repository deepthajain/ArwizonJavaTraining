package com.arwizon;

import java.util.Scanner;

public class CustomerInterfaceImp implements CustomerInterface {
	

	@Override
	public Customer addCustomer(String name, String address, String accountType) {
	
		
		
			Customer c=  new Customer();
			c.setName(name);
			c.setAddress(address);
			c.setAccountType(accountType);
			c.setCid(Customer.getCount());
			
		
		return c;
		
		// TODO Auto-generated method stub
		
	}

}
