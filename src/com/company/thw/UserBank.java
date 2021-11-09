package com.company.thw;


import com.company.myexcp.AccountException;
import com.company.myexcp.MoneyValueException;

public class UserBank {
    public static void main(String[] args) {
        try {
            MoneyTransactionUtil.sendTo("5435 5435 5437 7677", "4544 4567 8909 4543", 350);
        }catch (AccountException e){
            System.out.println("Ошибка с реквизитами банка. Возможно, номер карты отправителя и получателя совпадают.");
        }catch (MoneyValueException e){
            System.out.println("Ошибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна превышать лимит в 100000");

        }
    }
}
