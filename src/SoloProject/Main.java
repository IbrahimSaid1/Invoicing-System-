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


		Product obj1= new Product();
		Scanner sca= new Scanner(System.in);
		Stack<String> myStack= new Stack<>();
		Stack<String> myStack1= new Stack<>();

		
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
					
					try {
					System.out.println("Enter number of items: ");
					int no= sca.nextInt();
					
					System.out.println("Enter items: ");
					for(int i=0; i<=no; i++) {
						String items= sca.next();
						
					}
					
					}catch (Exception e) {
						System.out.println("Error...");
						 e.printStackTrace();					
						 }	
					
					break;
				
				
				
				
				case 2:
					System.out.println("Enter shop name: ");
					String shopName= sca.next();
					myStack.push("                      "+shopName);
					
					break;

				
				
				
				
				
				case 3:
					
					try {
					System.out.println("Entet tel NO: ");
					int telNo= sca.nextInt();
					String tel= Integer.toString(telNo);
					myStack.push(tel);
					
					System.out.println("Entet fax NO: ");
					int faxNo= sca.nextInt();
					String fax= Integer.toString(faxNo);
					myStack.push(fax);
					
					System.out.println("Entet email: ");
					String email= sca.next();
					myStack.push(email);
					
					System.out.println("Entet website: ");
					String website= sca.next();
					myStack.push(website);
					myStack.push("-------------------------------------------------------------------");
					
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
							obj1.setProductName(productName); 
							myStack1.push("Product: "+productName);
							
							System.out.println("Entert product ID: ");
							int productId= sca.nextInt();
							obj1.setProductId(productId);
							String id= Integer.toString(productId);
							myStack1.push("ID: "+id);


							System.out.println("Entert product price: ");
							Double productPrice= sca.nextDouble();
							obj1.setProductPrice(productPrice);
							String price= Double.toString(productPrice);
							myStack1.push("Price: "+price);
							
						
					 }
					 
					 
					 FileOutputStream file = new FileOutputStream("Product.txt");
					 ObjectOutputStream out = new ObjectOutputStream(file);
					 out.writeObject(obj1);
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
					myStack1.removeElementAt(delete);
					
					break;

					
					
				case 3:
					System.out.print("Enter index number of the price of item you want to change it: ");
					int itemToChange= sca.nextInt();
					myStack1.removeElementAt(itemToChange);
					
					System.out.println("Entert new product price: ");
					Double productPrice= sca.nextDouble();
					obj1.setProductPrice(productPrice);
					String newValue= Double.toString(productPrice);
					myStack1.push("Price: "+newValue);
					

					
					break;

					
					
					
				case 4:
					System.out.println("Report all items: ");
					System.out.println(myStack1);
					break;

					
					
					
					
					
				case 5:
					
					condition2= false;
					break;

				}
			
			}
			
				break;

			
				
				
				
				
			
			
			case 3:
				
				try {
				System.out.print("Please enter customer name: ");
				String customerName= sca.next();
				System.out.print("Please enter customer phone number: ");
				int phoneNumber= sca.nextInt();
				System.out.print("Please enter invoice date: ");
				char invoiceDate= sca.next().charAt(0);
				
			}catch (Exception e) {
				System.out.println("Error...");
				 e.printStackTrace();
			}
			
				break;

			
			
			
			case 4:
			
			
				break;

			
			
			
			case 5:
			
			
			
				break;

			
			case 6:
			
			
				break;

			
			
			case 7:
			
			
				break;

			
			
			case 8:
				condition= false;
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



