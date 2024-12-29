package Models.Customer;

public class SavingsAccount extends Account{
    private double withdrawLimit;

    public SavingsAccount(int accountNumber) {
        super(accountNumber);
        this.withdrawLimit = 2000;
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

    @Override
    public void withdrawMoney(double amount){
        if(amount>withdrawLimit){
            System.out.println("You have exceeded withdrawl limit!!!!!");
            return;
        }
        double availableBalance = this.getAvailableBalance();
        if(amount>availableBalance) {
            System.out.println("You have Low Balance");
            return;
        }
        this.setAvailableBalance(this.getAvailableBalance()-amount);
    }
}
