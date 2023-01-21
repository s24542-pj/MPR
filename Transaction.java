package pl.pjatk.S24542;

public class Transaction {

    private final int clientID;
    private double saldo;

    public Transaction(int clientID,double saldo){
        this.clientID = clientID;
        this.saldo = saldo;
    }
    public int getClientID() {
        return clientID;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
