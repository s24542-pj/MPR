package pl.pjatk.S24542;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S24542BankApplication {

	public S24542BankApplication(BankService bankService){
		Client client1 = new Client(1,2000,true);
		Client client2 = new Client(2,4000,true);
		Client client3 = new Client(3,6000,false);
		Client client4 = new Client(4,8000,true);

		bankService.createPayment(client1,"ACCEPTED",253,true);

		bankService.putMoney(client2,200);

		bankService.getUserdata(client3);
	}
	public static void main(String[] args) {
		SpringApplication.run(S24542BankApplication.class, args);
	}

}
