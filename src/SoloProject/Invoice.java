package SoloProject;

public class Invoice {
	
	Product obj1= new Product();
	
	private String customerName;
	private int phoneNumber;
	private char invoiceDate;
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
	public char getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(char invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	

}
