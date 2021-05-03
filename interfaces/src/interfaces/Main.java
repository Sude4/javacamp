package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(), new EmailLogger(),new FileLogger()};
CustomerManager customerManager =new CustomerManager(loggers);

Customer sude = new Customer(1," Sude","Cetin");
customerManager.add(sude);

	}

}
