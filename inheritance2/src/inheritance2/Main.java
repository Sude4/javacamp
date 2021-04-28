package inheritance2;

public class Main {

	public static void main(String[] args) {
	
		CustomerManager cutCustomerManager = new CustomerManager();
		cutCustomerManager.add(new EmailLogger());		

	}

}
