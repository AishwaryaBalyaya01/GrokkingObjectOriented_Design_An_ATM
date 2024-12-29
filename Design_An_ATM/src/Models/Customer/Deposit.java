package Models.Customer;

import java.util.Scanner;

public class Deposit extends Transaction{

    private double amount;

    public Deposit(String creationDate, int transactionId) {
        super(creationDate, transactionId);
        this.amount = 0.00;
    }
    @Override
    public boolean makeTransation(Account account) {
        System.out.println("Please select what you wish to deposit?  ");
        return true;
    }

    public double getAmount() {
        return amount;
    }
}
