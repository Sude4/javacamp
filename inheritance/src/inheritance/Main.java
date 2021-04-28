package inheritance;

public class Main {

	public static void main(String[] args) {
IndividualCustomer sude = new IndividualCustomer();
sude.customerNumber ="12345";


CorporateCustomer hepsiBurada = new CorporateCustomer();
hepsiBurada.customerNumber ="78910";

SendikaCustomer abc = new SendikaCustomer();
abc.customerNumber ="99999";

CustomerManager customerManager = new CustomerManager();

Customer[] customers = {sude, abc, hepsiBurada};



customerManager.addMultiple(customers);
	


	}

}
