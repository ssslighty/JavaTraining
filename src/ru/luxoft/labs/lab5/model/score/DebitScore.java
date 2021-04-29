package ru.luxoft.labs.lab5.model.score;

import ru.luxoft.labs.lab5.model.account.Account;
import ru.luxoft.labs.lab5.model.money.Money;

import java.util.Scanner;

public class DebitScore extends Score {
    private final CreditScore creditScore;

    public DebitScore(Money balance, Account owner, Integer number, CreditScore creditScore) {
        super(balance, owner, number);
        this.creditScore = creditScore;
    }

    @Override
    protected boolean checkBefore() {
        Money creditBalance = this.creditScore.getMoneyWithoutLess();
        return creditBalance.getValue() < -20000;
    }

    public Money score() {
        Scanner scanner = new Scanner(System.in);
        double sumValue = scanner.nextDouble();
        String ccy = scanner.next();
        this.addMoney(new Money(sumValue, ccy));
        return this.getMoneyWithoutLess();
    }
}
