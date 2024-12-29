package Models.Customer;

import Enums.TransactionStatus;

public abstract class Transaction {
    private int transactionId;
    private String creationDate;
    private TransactionStatus status;

    public Transaction(String creationDate, int transactionId) {
        this.creationDate = creationDate;
        this.transactionId = transactionId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public abstract boolean makeTransation(Account account);
}
