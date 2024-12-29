package Models.ATM;

public class CheckDepositSlot extends  DepositSlot {
    public CheckDepositSlot(double cashAmount) {
        super(cashAmount);
    }

    public double receiveDollarBill() {
        return this.getTotalAmount();
    }
    @Override
    public void depositAmount(double totalAmount) {
        this.setTotalAmount(super.getTotalAmount()+totalAmount);
    }

}
