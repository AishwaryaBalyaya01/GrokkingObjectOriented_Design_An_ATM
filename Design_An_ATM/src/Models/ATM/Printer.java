package Models.ATM;

import Models.Customer.Transaction;

public class Printer {
    public void printReceipt(Transaction transaction){
        System.out.println(transaction.getTransactionId()+" "+transaction.getStatus()+" "+transaction.getCreationDate());
    }
}
