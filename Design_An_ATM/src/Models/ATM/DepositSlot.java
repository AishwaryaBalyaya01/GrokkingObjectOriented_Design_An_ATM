package Models.ATM;

public abstract class DepositSlot {
    private double totalAmount;

    public DepositSlot(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public abstract void depositAmount(double totalAmount);

}
