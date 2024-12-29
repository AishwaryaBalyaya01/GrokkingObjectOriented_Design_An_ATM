package Models.ATM;

public class CashDispenser {
    private int oneDollarBill = 1;
    private int totalFiveDollarBills = 5;
    private int totalTwentyDollarBills = 25;

    public boolean dispenseCash(double amount){
        if(canDispenseCash(amount)) {
            System.out.println(amount);
            return true;
        }
        return false;
    }

    public boolean canDispenseCash(double amount){
        if(amount<=25000) return true;
        return false;
    }
}
