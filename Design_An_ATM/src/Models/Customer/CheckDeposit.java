package Models.Customer;

import java.util.Scanner;

public class CheckDeposit extends Deposit{
    public CheckDeposit(String creationDate, int transactionId) {
        super(creationDate, transactionId);
    }
    @Override
    public boolean makeTransation(Account account) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter amount you wish to deposit: 100, 200, 500, Custom Amount ");
        double amount = sc.nextInt();
        account.depositMoney(amount);
        return true;
    }
}
