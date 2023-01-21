package pl.pjatk.S24542;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;

class BankServiceTest2 {

    private final ClientStorage clientStorage = new ClientStorage();
    private final BankService bankService = new BankService(clientStorage);

    @Test
    void createPayment() {

        Client client1 = new Client(1,1000,true);
        String status = "ACCEPTED";
        double value = 200;
        boolean login = true;

        bankService.createPayment(client1,status,value,login);

        assertThat(client1.getMoney()).isEqualTo(200);

    }
}