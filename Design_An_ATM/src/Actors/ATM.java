package Actors;

import Models.ATM.*;
import Models.Customer.Address;
import Models.Customer.CashDeposit;
import Models.Customer.CheckDeposit;
import Models.Customer.Transaction;

public class ATM {
    private int atmId;
    private Address location;
    private CashDispenser cashDispenser;
    private Keypad keypad;
    private Screen screen;
    private Printer printer;
    private CheckDepositSlot checkDepositSlot;
    private CashDepositSlot cashDepositSlot;
    private CardReader cardReader;

    public ATM(int atmId, Address location, Screen screen, Printer printer, CashDispenser cashDispenser, Keypad keypad, CashDepositSlot cashDepositSlot, CheckDepositSlot checkDepositSlot) {
        this.atmId = atmId;
        this.location = location;
        this.screen = screen;
        this.cashDispenser = cashDispenser;
        this.keypad = keypad;
        this.printer = printer;
        this.cashDepositSlot = cashDepositSlot;
        this.checkDepositSlot = checkDepositSlot;
    }


    public int getAtmId() {
        return atmId;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }
    public boolean authenticateUser(Customer customer){
        if(String.valueOf(customer.getCard().getCardNumber()).length()==9 && customer.getCard().getExpiryDate()=="30/12/2025") return true;
        return false;
    }
    public boolean makeTransaction(Customer customer, Transaction transaction){
        if(transaction.makeTransation(customer.getAccount())) return true;
        return false;
    }
}
