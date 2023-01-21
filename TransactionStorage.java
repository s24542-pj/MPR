package pl.pjatk.S24542;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TransactionStorage {
    private final List<Transaction> transactionsList = new ArrayList<>();

    TransactionStorage(){}

    public List<Transaction> getTransactionsList() {
        return transactionsList;
    }
}
