package com.company.thw;

import com.company.myexcp.AccountException;
import com.company.myexcp.MoneyValueException;

public class MoneyTransactionUtil {
    private MoneyTransactionUtil() {
    }

    public static void sendTo(String card1, String card2, int sum) throws AccountException, MoneyValueException {
        if(card1.equals(card2)){
            throw new AccountException();
        } else if (sum <= 0 || sum >= 100_000){
            throw new MoneyValueException();
        } else{
            System.out.println("Сумма " + sum + ", со счета " + card1 + " успешно переведена на счет " + card2);
        }
    }
}
