package pl.pjatk.S24542;

public class Client {
    private int clientID;
    private double money;

    public Client(int clientID, double money){
        this.clientID = clientID;
        this.money = money;
    }
    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
