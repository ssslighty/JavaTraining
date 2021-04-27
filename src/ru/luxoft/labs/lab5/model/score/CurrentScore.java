package ru.luxoft.labs.lab5.model.score;

import ru.luxoft.labs.lab5.model.account.Account;
import ru.luxoft.labs.lab5.model.money.Money;

import java.util.Scanner;

public class CurrentScore extends Score {
    private DebitScore debitScore;

    public CurrentScore(Money balance, Account owner, Integer number, DebitScore debitScore) {
        super(balance, owner, number);
        this.debitScore = debitScore; }

    @Override
    protected boolean checkBefore() {
        return false;
    }
    public Money score(){
        Scanner scanner = new Scanner(System.in);
        double sumValue = scanner.nextDouble();
        String ccy = scanner.next();
        if (sumValue > 1000000){
            this.addMoney(new Money(sumValue,ccy));
            debitScore.addMoney(new Money(2000, ccy));
        }
        return this.getMoneyWithoutLess();
    }
}
