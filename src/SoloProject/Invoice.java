package SoloProject;

import java.io.Serializable;
import java.util.Scanner;

public class Invoice implements Serializable{
	
	Product obj1= new Product();
	transient Scanner s = new Scanner(System.in); 

	private int invoiceNo;
	private String customerName;
	private int phoneNumber;
	private String invoiceDate;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	

}
