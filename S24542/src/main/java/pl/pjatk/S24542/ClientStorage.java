package pl.pjatk.S24542;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientStorage {
    private final List<Client> clients = new ArrayList<>();

    ClientStorage(){

        for (Client client : clients){
            System.out.println(client);
        }
    }
    public List<Client> getClients(){
        return clients;
    }
    public boolean isLogin(){
        for (Client client : clients){
            if (client.getLogin() == true){
                return true;
            }
            return false;

        }
        return false;
    }
}
