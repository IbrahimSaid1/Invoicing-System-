package SoloProject;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Stack;


public class Main {

	public static void main(String[] args) throws IOException {

		int invoiceNo = 0;
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

		boolean condition =true;
		while(condition) {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Data.txt"));
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
					System.out.println("Enter shop name: ");
					String shopName= sca.next();
					myStack1.push("                      "+shopName);
					
					break;

				
				
				
				
				
				case 3:
					
					try {
					System.out.println("Entet tel NO: ");
					int telNo= sca.nextInt();
					String tel= Integer.toString(telNo);
					myStack1.push("Tel"+tel);
					
					System.out.println("Entet fax NO: ");
					int faxNo= sca.nextInt();
					String fax= Integer.toString(faxNo);
					myStack1.push("Fax"+fax);
					
					System.out.println("Entet email: ");
					String email= sca.next();
					myStack1.push("Email"+email);
					
					System.out.println("Entet website: ");
					String website= sca.next();
					myStack1.push("Website"+website);
					myStack1.push("-------------------------------------------------------------------");
					
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
						 System.out.println("Entert product name: ");
							String productName= sca.next();
							obj.obj1.setProductName(productName); 
							myStack.push("Product: "+productName);
							
							System.out.println("Entert product ID: ");
							int productId= sca.nextInt();
							obj.obj1.setProductId(productId);
							String id= Integer.toString(productId);
							myStack.push("ID: "+id);


							System.out.println("Entert product price: ");
							Double productPrice= sca.nextDouble();
							obj.obj1.setProductPrice(productPrice);
							String price= Double.toString(productPrice);
							myStack.push("Price: "+price);
							
						
					 }
					 
					 
					 FileOutputStream file = new FileOutputStream("Product.txt");
					 ObjectOutputStream out = new ObjectOutputStream(file);
					 out.writeObject(obj.obj1);
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
				Double total=0.0;
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
				
				System.err.print("Enter number of items: ");
				int x= sca.nextInt();
				for(int l=0; l<x; l++ ) {
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
				String tot= Double.toString(total);
				myStack1.push("The total peice: "+tot);	
				System.out.println("-----------------------------------------------");

				 for (String list: myStack1)
				 {
				 writer1.write("\n"+list);
				 }
				 writer1.close();
				
				 FileOutputStream file = new FileOutputStream("InvoiceSerialize.txt");
				 ObjectOutputStream out = new ObjectOutputStream(file);
				 out.writeObject(obj.obj1);
				 out.close();
				 file.close();
				 
			}catch (IOException e) {
				System.out.println("Error...");
				 e.printStackTrace();
			}
			
				count3++;
				break;

			
			
			
			case 4:
			
			
				count4++;
				break;

			
			
			
			case 5:
			
			System.out.println(myStack1);
			
			count5++;
				break;

			
			case 6:
			try {
				
				System.out.print("Enter NO of invoice you want to found it: ");
				int number= sca.nextInt();
				if(number== invoiceNo) {
					System.out.println(myStack1);
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
				condition= false;
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



