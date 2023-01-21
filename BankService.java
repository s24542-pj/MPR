package pl.pjatk.S24542;

import org.springframework.stereotype.Component;

@Component
public class BankService {

    private final ClientStorage clientStorage;

    private final TransactionStorage transactionStorage;

    public BankService(ClientStorage clientStorage, TransactionStorage transactionStorage){
        this.clientStorage = clientStorage;
        this.transactionStorage = transactionStorage;
    }
}
