package pl.pjatk.S24542;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S24542BankApplication {

	public BankAplication(BankService bankService){
		Client client1 = new Client(1,2000);
		Client client2 = new Client(2,4000);
		Client client3 = new Client(3,6000);
		Client client4 = new Client(4,8000);
	}
	public static void main(String[] args) {
		SpringApplication.run(S24542BankApplication.class, args);
	}

}
