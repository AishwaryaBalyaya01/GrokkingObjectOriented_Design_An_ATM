package Models.Customer;

public abstract class Account {
    private int accountNumber;

    private double availableBalance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.availableBalance = 0.00;
    }
    public double getAvailableBalance(){
        return this.availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public abstract void depositMoney(double amount);
    public abstract void withdrawMoney(double amount);
}
