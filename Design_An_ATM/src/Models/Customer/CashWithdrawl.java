package Models.Customer;

import java.util.Scanner;

public class CashWithdrawl extends Transaction{
    private double amount;

    public CashWithdrawl(String creationDate, int transactionId) {
        super(creationDate, transactionId);
        this.amount = 0.00;
    }

    @Override
    public boolean makeTransation(Account account) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter amount you wish to withdraw: 100, 200, 500, Custom Amount ");
        this.amount = sc.nextInt();
        account.withdrawMoney(amount);
        return true;
    }

    public double getAmount() {
        return amount;
    }
}
