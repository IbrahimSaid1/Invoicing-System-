package SoloProject;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;


public class Main {

	public static void main(String[] args) throws IOException {

		int invoiceNo = 0;
		int numberOfItems=0;
		Double total=0.0;

		Invoice obj= new Invoice();
		Scanner sca= new Scanner(System.in);

		Stack<String> myStack= new Stack<>();
		Stack<String> myStack1= new Stack<>();
		
		BufferedWriter writer1 = new BufferedWriter(new FileWriter("Invoice.txt"));

		
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		int count7=0;
		int count8=0;
		int count9=0;
		
		boolean condition =true;
		while(condition) {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Product.txt"));
			System.out.println("1. Shop Settings");
			System.out.println("2. Manage Shop Items");
			System.out.println("3. Create New Invoice");
			System.out.println("4. Report: Statistics");
			System.out.println("5. Report: All Invoices");
			System.out.println("6. Search");
			System.out.println("7. Program Statistics");
			System.out.println("8. Exit");
			
			int a= sca.nextInt();
			switch (a){
		
			case 1:
				boolean condition1= true;
				while(condition1) {
				System.out.println("1. Load Data");
				System.out.println("2. Set Shop Name");
				System.out.println("3. Set Invoice Header");
				System.out.println("4. Go Back");
				
				int b= sca.nextInt();
				switch (b) {
				case 1:
					
				System.out.println(myStack);
				System.out.println(myStack1);	
					break;
				
				
				
				
				case 2:
					System.out.print("Enter shop name: ");
					String shopName= sca.next();
					myStack1.push("                      "+shopName);
					
					break;

				
				
				
				
				
				case 3:
					
					try {
					System.out.print("Entet tel NO: ");
					int telNo= sca.nextInt();
					String tel= Integer.toString(telNo);
					myStack1.push("Tel: "+tel);
					
					System.out.print("Entet fax NO: ");
					int faxNo= sca.nextInt();
					String fax= Integer.toString(faxNo);
					myStack1.push("Fax: "+fax);
					
					System.out.print("Entet email: ");
					String email= sca.next();
					myStack1.push("Email: "+email);
					
					System.out.print("Entet website: ");
					String website= sca.next();
					myStack1.push("Website: "+website);
					myStack1.push("-----------------------------------------------");
					
					}catch (Exception e) {
						System.out.println("Error...");
						 e.printStackTrace();					
						 }	
					
					break;

				
				
				
				
				
				case 4:
					
					condition1= false;
					break;

				}
				
			}
			
				count1++;
				break;

			
			
			case 2:
				
				boolean condition2= true;
				while(condition2) {
				System.out.println("1. Add items");
				System.out.println("2. Delete items");
				System.out.println("3. Change Item Price");
				System.out.println("4. Report All Items");
				System.out.println("5. Go Back");
				
				int c= sca.nextInt();
				switch (c) {
				case 1:
					try {
						
					System.out.println("Enter number of items: ");
					int no= sca.nextInt();
					
					 for(int j=0; j< no; j++) {
						 System.out.print("Entert product name: ");
							String productName= sca.next();
							obj.obj1.setProductName(productName); 
							myStack.push("Product: "+productName);
							
							System.out.print("Entert product ID: ");
							int productId= sca.nextInt();
							obj.obj1.setProductId(productId);
							String id= Integer.toString(productId);
							myStack.push("ID: "+id);


							System.out.print("Entert product price: ");
							Double productPrice= sca.nextDouble();
							obj.obj1.setProductPrice(productPrice);
							String price= Double.toString(productPrice);
							myStack.push("Price: "+price);
							
						
						
					 }
					 
					 
					 FileOutputStream file = new FileOutputStream("ProductSerialize.txt");
					 ObjectOutputStream out = new ObjectOutputStream(file);
					 out.writeObject(myStack);
					 out.close();
					 file.close();
					 
					}catch (IOException e) {
							System.out.println("Error...");
							 e.printStackTrace();	
											}
		
					
					break;

				
				case 2:
				
					System.out.print("Enter index number of item you want to remove it: ");
					int delete= sca.nextInt();
					myStack.removeElementAt(delete);
					
					break;

					
					
				case 3:
					System.out.print("Enter index number of the price of item you want to change it: ");
					int itemToChange= sca.nextInt();
					myStack.removeElementAt(itemToChange);
					
					System.out.println("Entert new product price: ");
					Double productPrice= sca.nextDouble();
					obj.obj1 .setProductPrice(productPrice);
					String newValue= Double.toString(productPrice);
					myStack.push("Price: "+newValue);
					

					
					break;

					
					
					
				case 4:
					System.out.println("Report all items: ");
					System.out.println(myStack);
					break;

					
					
					
					
					
				case 5:
					
					condition2= false;
					break;

				}
			
			}
				count2++;
				break;

			
				
				
				
				
			
			
			case 3:
				try {
					
				System.out.print("Please enter invoice NO: ");
				invoiceNo= sca.nextInt();
				obj.setInvoiceNo(invoiceNo);
				String no= Integer.toString(invoiceNo);
				myStack1.push("Invoice NO."+no);
				
				System.out.print("Please enter customer name: ");
				String customerName= sca.next();
				obj.setCustomerName(customerName);
				myStack1.push("Coustmer Name: "+customerName);
				
				System.out.print("Please enter customer phone number: ");
				int phoneNumber= sca.nextInt();
				obj.setPhoneNumber(phoneNumber);
				String phoneNO= Integer.toString(phoneNumber);
				myStack1.push("Phone Number: "+phoneNO);

				System.out.print("Please enter invoice date: ");
				String invoiceDate= sca.next();
				obj.setInvoiceDate(invoiceDate);
				myStack1.push("Date: "+invoiceDate);
				myStack1.push("-----------------------------------------------");
				
				System.err.print("Enter number of items: ");
				numberOfItems= sca.nextInt();
				count9= count9+ numberOfItems;
				for(int l=0; l<numberOfItems; l++ ) {
				System.out.print("Enter product name: ");
				String productName= sca.next();
				obj.obj1.setProductName(productName);
				myStack1.push("Product Name: "+productName);

				System.out.print("Enter product ID: ");
				int productId= sca.nextInt();
				obj.obj1.setProductId(productId);
				String proId= Integer.toString(productId);
				myStack1.push("Product ID: "+proId);
				
				System.out.print("Enter product price: ");
				Double productPrice= sca.nextDouble();
				obj.obj1.setProductPrice(productPrice);
				String proPrice= Double.toString(productPrice);
				myStack1.push("Price: "+proPrice);
				
				System.out.print("Enter quantity: ");
				int quantity= sca.nextInt();
				obj.obj1.setQuantity(quantity);
				String quan= Integer.toString(quantity);
				myStack1.push("quantity: "+quan);
				
				total= total+ productPrice*quantity;
				
			
				
				
				
				
				}
				myStack1.push("-----------------------------------------------");
				System.out.println("The total price: "+total);
				String tot= Double.toString(total);
				myStack1.push("The total price: "+tot);
				
				System.out.print("Enter paid amount: ");
				Double paidAmount= sca.nextDouble();
				obj.setPaidAmount(paidAmount);
				String paid= Double.toString(paidAmount);
				myStack1.push("Paid Amount: "+paid);
				
				double balance= total-paidAmount;
				System.out.println("Balance: "+balance);
				String bal= Double.toString(balance);
				myStack1.push("Balance: "+bal);
				
				System.out.println("-----------------------------------------------");
				
				writer1.write("Invoice");
				 for (String list: myStack1)
				 {
				 writer1.write("\n "+list);
				 }
				 writer1.close();
				
				
				 FileOutputStream file = new FileOutputStream("InvoiceSerialize.txt");
				 ObjectOutputStream out = new ObjectOutputStream(file);
				 out.writeObject(myStack1);
				 out.close();
				 file.close();
				 
			}catch (IOException e) {
				System.out.println("Error...");
				 e.printStackTrace();
			}
			
				count3++;
				break;

			
			
			
			case 4:
				
			System.out.println("No of items: "+count9);
			System.out.println("No of invoices: "+count3);
			System.out.println("Total sales: "+total);
			
				count4++;
				break;

			
			
			
			case 5:
				
				Object[] arr= myStack1.toArray();
				for(int u=6; u< arr.length; u++) {
			System.out.println(arr[u]);
				}
			count5++;
				break;

			
			case 6:
			try {
				Object[] arr1= myStack1.toArray();
				
				System.out.print("Enter NO of invoice you want to found it: ");
				int number= sca.nextInt();
				if(number== invoiceNo) {
					for(int f=6; f< arr1.length; f++) {
					System.out.println(arr1[f]);
				}
				}
				else {
					System.out.println("Sorry This Invoice Does Not Found It.");
				}
				
			}catch (Exception e) {
				System.out.println("Error...");
				 e.printStackTrace();
			}
				count6++;
				break;

			
			
			case 7:
				count7++;
				System.out.println("1. Shop Settings: "+count1);
				System.out.println("2. Manage Shop Items: "+count2);
				System.out.println("3. Create New Invoice: "+count3);
				System.out.println("4. Report: Statistics: "+count4);
				System.out.println("5. Report: All Invoices: "+count5);
				System.out.println("6. Search: "+count6);
				System.out.println("7. Program Statistics: "+count7);
				System.out.println("8. Exit: "+count8);
				System.out.println("\n");
				
				break;

			
			
			case 8:
				
				System.out.println("Are you sure you want to exit? ");
				System.out.println("1. YES     2. NO");
				int q=sca.nextInt();
				
				if(q==1) {
					System.out.println("See You...");
				condition= false;
				}
				
				count8++;
			
				break;

		}
		
	
		
		
			for (String list : myStack)
			 {
			 writer.write("\n"+list);
			 }
				writer.close();
	
		}
		
	}
}



