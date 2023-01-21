package pl.pjatk.S24542;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;

class BankServiceTest3int {
    @MockBean
    private ClientStorage clientStorage;

    @Autowired BankService bankService;


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