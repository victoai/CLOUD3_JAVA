package day14.학생.송수빈_용지민;

public class Main {
	
	CustomerI customer;
	
	
	public void setCustomer(CustomerI customer) {
		this.customer = customer;
	}
	
	public void run() {
		
		customer.order();
		
		customer.inputQty();
		
		customer.pay();
		
	}

	public static void main(String[] args) {
		
		Main m = new Main();
		
		m.setCustomer(new CustomerA());
		m.run();
		
		m.setCustomer(new CustomerB());
		m.run();
		
		m.setCustomer(new CustomerC());
		m.run();

	}

}
