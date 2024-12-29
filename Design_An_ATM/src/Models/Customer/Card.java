package Models.Customer;

public class Card {
    private int cardNumber;
    private String name;
    private String expiryDate;
    private int cvv;
    private int PIN;
    private Address address;

    public Card(int cardNumber, String name, int cvv, int PIN) {
        this.cardNumber=cardNumber;
        this.name = name;
        this.cvv = cvv;
        this.PIN = PIN;
        this.expiryDate = "30/12/2025";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void resetPIN(int PIN) {
        this.PIN = PIN;
    }

    public int getCvv() {
        return cvv;
    }
    public Address getAddress(){
        return this.address;
    }
    public void setAddress(String streetAddress, String city, String state, String zipCode, String country){
        this.address = new Address(streetAddress, city, state,zipCode, country);
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}
