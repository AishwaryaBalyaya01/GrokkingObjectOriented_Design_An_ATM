package Models.Customer;

import java.util.Scanner;

public class CashDeposit extends Deposit{
    private double cashDepositLimit=20000.00;
    public CashDeposit(String creationDate, int transactionId) {
        super(creationDate, transactionId);
    }
    @Override
    public boolean makeTransation(Account account) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter amount you wish to deposit: 100, 200, 500, Custom Amount ");
        double amount = sc.nextInt();
        if(amount<=cashDepositLimit){
            account.depositMoney(amount);
            return true;
        }
        System.out.println("Amount is more than limit, cant deposit");
        return false;
    }
}
