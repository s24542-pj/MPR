package pl.pjatk.S24542;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankService {

    private final ClientStorage clientStorage;


    public BankService(ClientStorage clientStorage){
        this.clientStorage = clientStorage;
    }
    public double createPayment(Client client,String status,double value,boolean login){
        if (client.getMoney() >= value){
            if (client.getLogin()==true){
                client.setMoney(client.getMoney()-value);
                System.out.println("przelew wykonany");
                System.out.printf("pozostałe srodki"+ client.getMoney());
                return value;
            }else {
                System.out.println("klient nie jest zalogowany");

            }

        } else {
            System.out.println("brak wystarczających środków"+"\n");
        }
        return value;
    }
    public void putMoney(Client client,double value){
        double newValue = client.getMoney() + value;
        client.setMoney(newValue);
        System.out.println("Stan konta zmieniony o " + value);
        System.out.println("nowy stan konta to"+ newValue);
    }
    public void getUserdata(Client client){
        System.out.println("ID: "+client.getClientID());
        System.out.println("money: "+client.getMoney());
    }
}
