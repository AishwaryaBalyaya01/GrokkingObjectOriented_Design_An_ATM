package Actors;

import java.util.ArrayList;
import java.util.List;

public class Bank {private String name;
    private String bankCode;
    private List<ATM> atms = new ArrayList<>();

    public Bank(String name, String bankCode) {
        this.name = name;
        this.bankCode = bankCode;
    }

    public String getBankCode(){
        return this.bankCode;
    }

    public String getName() {
        return name;
    }

    public boolean addATM(ATM atm){
        this.atms.add(atm);
        System.out.println(atm.getAtmId()+" atm added successfully!");
        return true;
    }
}
