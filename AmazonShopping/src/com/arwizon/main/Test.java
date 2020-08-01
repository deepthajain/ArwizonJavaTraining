package com.arwizon.main;

import java.util.*;

import com.arwizon.exception.MyException;
import com.arwizon.model.ProductDetails;
import com.arwizon.service.ConnectionClass;
import com.arwizon.service.ServiceInterface;
import com.arwizon.service.ServiceInterfaceImp;
import com.arwizon.util.Utilities;

public class Test {

	public static void main(String[] args) throws MyException {

		ConnectionClass.Connectiondb();
		System.out.println("Press 1 to add new product press 2 to display product details press 3 to search press 4 to update press 5 to delete press 6 to exit");
		Scanner s = new Scanner(System.in);
		// ProductDetails[] arr = new ProductDetails[2];

		Set<ProductDetails> m = new HashSet<ProductDetails>();

		while (true) {
			System.out.println("Choose your option");
			int option = s.nextInt();
			switch (option) {

			case 1:
				String name = null;
				while (true) {
					System.out.println("Enter product name");
					name = s.next();
					try {
						Utilities.nameMatch(name);
						break;
					} catch (MyException e) {
						System.out.println(e.getMessage());
					}

				}
				String description = null;
				while (true) {
					System.out.println("Enter product description");
					description = s.next();
					try {
						Utilities.nameMatch(description);
						break;
					} catch (MyException e) {
						System.out.println(e.getMessage());
					}

				}

				String price1 = null;
				while (true) {
					System.out.println("Enter price");
					price1 = s.next();
					try {
						Utilities.priceMatch(price1);
						break;
					} catch (MyException e) {
						System.out.println(e.getMessage());
					}
				}
				int price = Integer.parseInt(price1);

				String manufacturerName = null;
				while (true) {
					System.out.println("Enter Manufacturer name");
					manufacturerName = s.next();
					try {
						Utilities.nameMatch(manufacturerName);
						break;
					} catch (MyException e) {
						System.out.println(e.getMessage());
					}

				}

				String discountOffered = null;
				while (true) {
					System.out.println("Enter discount offered");
					discountOffered = s.next();
					try {
						Utilities.discountMatch(discountOffered);
						break;
					} catch (MyException e) {
						System.out.println(e.getMessage());
					}

				}
				int discount = Integer.parseInt(discountOffered);

				String imgUrl = null;
				while (true) {
					System.out.println("Enter Imageurl");
					imgUrl = s.next();
					try {
						Utilities.urlMatch(imgUrl);
						break;
					} catch (MyException e) {
						System.out.println(e.getMessage());
					}
				}

				String numOfUnits = null;
				while (true) {
					System.out.println("Enter no of units");
					numOfUnits = s.next();
					try {
						Utilities.unitsMatch(numOfUnits);
						break;
					} catch (MyException e) {
						System.out.println(e.getMessage());
					}

				}
				int noOfUnits = Integer.parseInt(numOfUnits);

				String category = null;
				while (true) {
					System.out.println("Enter category");
					category = s.next();
					try {
						Utilities.nameMatch(category);
						break;
					} catch (MyException e) {
						System.out.println(e.getMessage());
					}
				}

				ServiceInterface si = new ServiceInterfaceImp();
				si.addProduct(name, description, manufacturerName, price, discount, imgUrl,
						noOfUnits, category);
				//m.put(p1.getProductId(),p1);
				System.out.println("Product added successfully!");
				break;
			case 2:
				ServiceInterface si1 = new ServiceInterfaceImp();
				Set<ProductDetails> m1=si1.displayProduct();
				for (ProductDetails p : m1) {
					System.out.println(p);
				}
				break;

			case 3:
				System.out.println("Enter product name to search");
				String pname = s.next();
				
				ServiceInterface prod = new ServiceInterfaceImp();

				Set<ProductDetails> product = prod.searchProduct(pname);
				if (product.size()==0) {
					System.out.println("Product not found");
				} else {
					//System.out.println(product);
					for (ProductDetails p : product) {
						System.out.println(p);
					}
							
				}
				break;			
			case 4:
				System.out.println("Please enter the id of product you want to delete");
				String id = s.next();
				int productId2 = Integer.parseInt(id);
				ServiceInterface prod1 = new ServiceInterfaceImp();
				
				prod1.deleteProduct(productId2);
				System.out.println("Product deleted successfully");
				
				break;

			case 5:
				ServiceInterface prod2 = new ServiceInterfaceImp();
				System.out.println("Enter the product id");
				String id1 = s.next();
				int productId3 = Integer.parseInt(id1);
				System.out.println("Enter the number of units");
				String numOfUnits1 = s.next();
				int noOfUnits1 = Integer.parseInt(numOfUnits1);
				prod2.updateProduct(productId3, noOfUnits1);
				System.out.println("Updated Successfully");
				break;

			case 6:
				System.exit(1);
				break;
			default:
				System.out.println("Please enter the valid option");
			}
		}

	}

	private static Set<ProductDetails> displayProduct() {
		// TODO Auto-generated method stub
		return null;
	}
}
/* ServiceInterface prod = new ServiceInterfaceImp();

ProductDetails[] product = prod.searchProduct(name1,li );

 System.out.println(indexValue);

 ServiceInterface prod = new ServiceInterfaceImp();

ProductDetails[] product = prod.searchProduct(name1,arr );
if (product[0] == null) {
System.out.println("Product not found");
else {
 for (ProductDetails pro : product) {
 if (pro == null) {
 break;
 } else {
 System.out.println(pro);
 }
 }
 }

 break;
*/
// boolean flag=false;
// for(int i=0;i<arr.length;i++)
// if(name1.equals(arr[i].getName())) {
// System.out.println(arr[i]);
// flag=true;