package com.arwizon;
import java.util.Scanner;
import java.util.*;
public class Test {
	
	public static void main(String[] args) {
		System.out.println("Press 1 to add new customer press 2 to display details press 3 to exit");
		Scanner s=new Scanner(System.in);
		Set<Customer> m=new HashSet<Customer>();
		
		CustomerInterface ci = new CustomerInterfaceImp();
		while(true) {
			System.out.println("Choose your option");
			int option=s.nextInt();
			switch(option) {
			
     case 1: 
					System.out.println("Enter name");
					String name=s.next();

					System.out.println("Enter address");
					String address=s.next();
					
					System.out.println("Enter account type");
					String accountType=s.next();
					
					
					Customer c1=ci.addCustomer(name,address,accountType);
					m.add(c1);
				
				 
				break;
				
							
	case 2:   for(Customer c2 :m) {
		       System.out.println(c2);
	}

	         break;
	
	         
	/*case 3:
		if(arr[0]!=null) {
			System.out.println("Enter customer name");
		
	       String name1=s.next();
	       boolean flag=false;
	       for(int i=0;i<arr.length;i++) {
	    	   if(name1.equals(arr[i].getName())) {
	    		   System.out.println(arr[i]);
		    	   flag=true;  
	    	   }
	    	 }
		
	       if(flag==false) {
	    	   System.out.println("No customer found");
	       }
		}
		
	       break;
	      */
	case 3: System.exit(1);
	     break;
	default: System.out.println("Please enter the valid option");
	}
}
}
}


