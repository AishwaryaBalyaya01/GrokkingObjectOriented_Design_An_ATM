package Models.Customer;

public class Account {
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

    public void depositMoney(double amount){
        System.out.println("Please mention which account to deposit");
    }
    public void withdrawMoney(double amount){
        System.out.println("Please mention which account to withdraw from");
    }
}
