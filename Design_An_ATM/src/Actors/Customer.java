package Actors;

import Enums.CustomerStatus;
import Models.Customer.Account;
import Models.Customer.Address;
import Models.Customer.Card;
import Models.Customer.Transaction;

public class Customer {
    private String name;
    private String email;
    private String phone;
    private Address address;
    private CustomerStatus status;
    private Account account;
    private Card card;

    public Customer(String name, String email, String phone, CustomerStatus status, Account account, Card card) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.account = account;
        this.card = card;
    }
    public void setAddress(Address address){
        this.address=address;
        System.out.println("Address updated");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
    public boolean makeTransaction(ATM atm,Transaction transaction){
        if(atm.makeTransaction(this,transaction)) return true;
        return false;
    }
}
