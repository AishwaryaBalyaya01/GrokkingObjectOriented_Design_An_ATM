package Models.ATM;

public class CashDepositSlot  extends  DepositSlot{

    public CashDepositSlot(double cashAmount) {
        super(cashAmount);
    }

    @Override
    public void depositAmount(double totalAmount) {
       this.setTotalAmount(super.getTotalAmount()+totalAmount);
    }

    public double checkAmount() {
        return super.getTotalAmount();
    }

}
