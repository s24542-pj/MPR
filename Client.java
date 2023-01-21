package pl.pjatk.S24542;

public class Client {
    private int clientID;
    private double money;
    private boolean login;

    public Client(int clientID, double money,boolean login){
        this.clientID = clientID;
        this.money = money;
        this.login = login;
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

    public boolean getLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID=" + clientID +
                ", money=" + money +
                '}';
    }
}
