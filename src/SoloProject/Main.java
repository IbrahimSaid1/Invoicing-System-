package SoloProject;


import java.sql.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;


public class Main {

	public static void main(String[] args) throws IOException {
		
		
		 String url = "jdbc:sqlserver://localhost:1433;" +
	                "databaseName=Shop;" +
	                "encrypt=true;" +
	                "trustServerCertificate=true";
	        
	        
	        String user = "sa";
	        String pass = "root";

	        
	        
	        
		int invoiceNo = 0;
		int numberOfItems=0;
		Double total=0.0;

		Invoice obj= new Invoice();
		Scanner sca= new Scanner(System.in);

		Stack<String> myStack= new Stack<>();
		Stack<String> myStack1= new Stack<>();
		


		
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
			
		
			
			
			System.out.println("0. Create Tables");
			System.out.println("1. Shop Settings");
			System.out.println("2. Manage Shop Items");
			System.out.println("3. Create New Invoice");
			System.out.println("4. Report: Statistics");
			System.out.println("5. Report: All Invoices");
			System.out.println("6. Search");
			System.out.println("7. Program Statistics");
			System.out.println("8. Exit");
			
			
			 Connection con = null;
			 
		        try {
		        	Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		        	DriverManager.registerDriver(driver);
		            con = DriverManager.getConnection(url, user, pass);
		            Statement st = con.createStatement();
			
			
			
			
			int a= sca.nextInt();
			switch (a){
			
			case 0:
		
//			 
//			 String sql = "CREATE TABLE Shops("
//					 +"Shop_ id INT PRIMARY KEY, "
//					 +"Shop_Name VARCHAR(255), "
//					 +"Tel VARCHAR(255) NOT NULL,"
//					 +"Fax VARCHAR(255), "
//					 +"Email VARCHAR(255),"
//					 +"Website VARCHAR(255));"
//					 
//					 
//
//					+"CREATE TABLE Items("
//					+"Product_id INT PRIMARY KEY,"
//					+"Product_Name VARCHAR(255), "
//					+"Product_Price DECIMAL(10,2) NOT NULL);"
//					
//					
//			
//					+"CREATE TABLE Invoices("
//					+"Invoice_No INT PRIMARY KEY,"
//					+"Coustmer_Name VARCHAR(255) NOT NULL,"
//					+"Phone_Number VARCHAR(255) NOT NULL,"
//					+"Invoice_Date VARCHAR(255),"
//					+"NoOf_items INT, "
//					+"Product_id Foriegn key REFERENCES Items(Product_id),"
//					+"Product_Name VARCHAR(255),"
//					+"Product_Price DECIMAL(10,2) NOT NULL),"
//					+"Total_Price DECIMAL(10,2)) ";
				
				
				
				String sql= "CREATE TABLE Shops ("
						 +"Shop_Name VARCHAR(255) PRIMARY KEY,"
						 +"Email varchar(255) not null,"
						 +"Tel int, "
						 +"Fax VARCHAR(255), "
						 +"Website VARCHAR(255));"
						 
						 
						 +"CREATE TABLE Items("
						 + "Product_id INT PRIMARY KEY,"
						 + "Product_Name VARCHAR(255),"
						 + "Product_Price DECIMAL(10,2));"
						 
						 
			 			 +" CREATE TABLE Invoices ("
			 			 +"Invoice_No INT PRIMARY KEY,"
			 			 +"Coustmer_Name VARCHAR(255),"
			 			 +"Phone_Number INT,"
			 			 +"Invoice_Date VARCHAR(255),"
			 			 +"NoOf_items INT, "
			 			 +"Product_id INT Foreign KEY REFERENCES Items(Product_id),"
			 			 +"Product_Name VARCHAR(255),"
			 			 +"Product_Price DECIMAL(10,2) NOT NULL,"
			 			 +"Total_Price DECIMAL(10,2) ,"
			 			 +"Paid_Amount DECIMAL(10,2) ,"
			 			 +"Balance DECIMAL(10,2))";
	
			 st.executeUpdate(sql);
			        

			
			 break;
			
		
			case 1:
				boolean condition1= true;
				while(condition1) {
				System.out.println("1. Load Data");
				System.out.println("2. Set Invoice Header");
				System.out.println("3. Go Back");
				
				int b= sca.nextInt();
				switch (b) {
				case 1:
					
				System.out.println(myStack);
				System.out.println(myStack1);	
					break;
				
				
				
				
				case 2:
					
					try {
					System.out.print("Enter shop name: ");
					String shopName= sca.next();
					myStack1.push("                      "+shopName);
							
					
					
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
					

					String sql1 = "insert into Shops(Shop_Name, Tel, Fax, Email, Website) values('" + shopName
		            		+ "','" + telNo + "','" + faxNo + "','" + email +"','" + website+"')";
					
					
					Integer m = st.executeUpdate(sql1);
		            
		 			if (m >= 1) {
		 				System.out.println("inserted successfully \n" + sql1);
		 			} else {
		 				System.out.println("insertion failed");
		 			}
		 			
		 			
		 			
		 	        String sql4 = "Select * from Shops";
		 	        ResultSet resultSet = st.executeQuery(sql4);
		 	        while (resultSet.next()) {
		 					System.out.println(resultSet.getString("shopName"));
		 					System.out.println(resultSet.getString("telNo"));
		 					System.out.println(resultSet.getString("faxNo"));
		 					System.out.println(resultSet.getString("email"));
		 					System.out.println(resultSet.getString("website"));
		 	        		}
		 			
		 			
					}catch (Exception e) {
						System.out.println("Error...");
						 e.printStackTrace();					
						 }	
					

					
					break;

				
				
				case 3:
					
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
							
							
							
							String sql2 = "insert into Items(Product_id, Product_Name, Product_Price) values('" + productId
				            		+ "','" + productName + "','" + productPrice + "')";
						

							Integer x = st.executeUpdate(sql2);
				            
				 			if ( x >= 1) {
				 				System.out.println("inserted successfully \n" + sql2);
				 			} else {
				 				System.out.println("insertion failed");
				 			}
							
				 			String sql4 = "Select * from Items";
				 	        ResultSet resultSet = st.executeQuery(sql4);
				 	        while (resultSet.next()) {
				 					System.out.println(resultSet.getString("productId"));
				 					System.out.println(resultSet.getString("productName"));
				 					System.out.println(resultSet.getString("productPrice"));
				 	        		}
				 			
					 
					 
			
					 
					}catch (Exception e) {
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
				
				System.out.println("The total price: "+total);
				
				
				System.out.print("Enter paid amount: ");
				Double paidAmount= sca.nextDouble();
				
				
				double balance= total-paidAmount;
				System.out.println("Balance: "+balance);
				
				
				String sql3 = "insert into Invoices(Invoice_No, Coustmer_Name, Phone_Number, Invoice_Date, NoOf_items, Product_id, Product_Name, Product_Price,"
						+ "Total_Price, Paid_Amount, Balance )"
						+ "values('" + invoiceNo+ "','" + customerName + "','" + phoneNumber + "','" + invoiceDate + "','" +numberOfItems + "','" + 
	            		productId + "','" + productName + "','" + productPrice + "','" + total + "','" + paidAmount + "','" + balance + "')";
			
				

				Integer z = st.executeUpdate(sql3);
	            
	 			if (z >= 1) {
	 				System.out.println("inserted successfully \n" + sql3);
	 			} else {
	 				System.out.println("insertion failed");
	 			}
	 			
	 			
	 			
	 			String sql5 = "Select * from Invoices";
	 	        ResultSet resultSet = st.executeQuery(sql5);
	 	        while (resultSet.next()) {
	 					System.out.println(resultSet.getString("invoiceNo"));
	 					System.out.println(resultSet.getString("customerName"));
	 					System.out.println(resultSet.getString("phoneNumber"));
	 					System.out.println(resultSet.getString("invoiceDate"));
	 					System.out.println(resultSet.getString("numberOfItems"));
	 					System.out.println(resultSet.getString("productId"));
	 					System.out.println(resultSet.getString("productName"));
	 					System.out.println(resultSet.getString("productPrice"));
	 					System.out.println(resultSet.getString("total"));
	 				
	 	        		}
	 			
				
				}
		
			
				
				
			
			}catch (Exception e) {
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
				
			       con.close();
			} catch (Exception ex) {
				System.err.println(ex);
			}
			       
			       
			    
					
					
					}
		
		
		}
	}



				

		
	
		
		     
		
			
	
		
		




