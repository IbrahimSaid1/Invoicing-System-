package SoloProject;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sca= new Scanner(System.in);
		Stack<String> myStack= new Stack<>();
		
		boolean condition =true;
		while(condition) {
			
			System.out.println("1. Shop Settings");
			System.out.println("2. Manage Shop Items");
			System.out.println("3. Create New Invoice");
			System.out.println("4. Report: Statistics");
			System.out.println("5. Report: All Invoices");
			System.out.println("6. Search");
			System.out.println("7. Program Statistics");
			System.out.println("8. Exit");
			
			int a= sca.nextInt();
			
			if(a==1) {
				boolean condition1= true;
				while(condition1) {
				System.out.println("1. Load Data");
				System.out.println("2. Set Shop Name");
				System.out.println("3. Set Invoice Header");
				System.out.println("4. Go Back");
				
				int b= sca.nextInt();
				if(b==1) {
					System.out.println("Enter number of items: ");
					int no= sca.nextInt();
					
					System.out.println("Enter items: ");
					for(int i=0; i<=no; i++) {
						String items= sca.next();
						
					}
				}
				
				if(b==2) {
					System.out.println("Enter shop name: ");
					String shopName= sca.next();
					myStack.push(shopName);
					
				}
				
				if(b==3) {
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
					
							
					
				}
				
				if(b==4) {
					
					condition1= false;
				}
				}
			}
			
			if(a==2) {
				
				boolean condition2= true;
				System.out.println("1. Add items");
				System.out.println("2. Delete items");
				System.out.println("3. Change Item Price");
				System.out.println("4. Report All Items");
				System.out.println("5. Go Back");
				
				int c= sca.nextInt();
				if(c== 1) {
					
				}
				
				if(c== 2) {
					
				}
				
				if(c== 3) {
					
				}
				
				if(c== 4) {
					
				}
				
				if(c== 5) {
					
					condition2= false;
				}
			}

		}
		
		
	
		
		
	}

}



