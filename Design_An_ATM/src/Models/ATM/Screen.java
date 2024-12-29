package Models.ATM;

import Enums.TransactionType;

public class Screen {
    private TransactionType type;
    public void showMessage(String message){
        System.out.println(message);
    }
    public TransactionType getInput(){
        return type;
    }
}
