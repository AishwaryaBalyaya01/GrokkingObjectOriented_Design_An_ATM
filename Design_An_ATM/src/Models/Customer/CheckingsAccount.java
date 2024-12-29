package Models.Customer;

public class CheckingsAccount extends Account{
    private double withdrawLimit;

    public CheckingsAccount(int accountNumber) {
        super(accountNumber);
        this.setAvailableBalance(10);
    }

    public double getWithdrawLimit(){
        return this.getWithdrawLimit();
    }

    @Override
    public void depositMoney(double amount){
        double balance = this.getAvailableBalance();
        balance+=amount;
        this.setAvailableBalance(balance);
        System.out.println("Checkings Account money deposited: "+amount+" Available balance: "+this.getAvailableBalance());
    }
}
