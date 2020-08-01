package com.arwizon;

public class Customer {
	private int cid;
	private static int count;
	private String name;
    private String address;
	private String accountType;
		static {
			count=101;
			System.out.println();
		}
	
	
     public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		Customer.count = count;
	}

	
		public Customer() {
			count++;
			
		}
		
		public int getCid() {
			return cid;
		}


		public void setCid(int id) {
			this.cid = id;
		}

	
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getAccountType() {
			return accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		

		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", name=" + name + ", address=" + address + ", accountType=" + accountType
					+ "]";
		}



		
		
		

		


		



		





		



		

}
