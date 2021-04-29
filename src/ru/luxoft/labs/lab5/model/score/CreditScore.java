package ru.luxoft.labs.lab5.model.score;

import ru.luxoft.labs.lab5.model.account.Account;
import ru.luxoft.labs.lab5.model.money.Money;

import java.util.Scanner;

public class CreditScore extends Score {
    public CreditScore(Money balance, Account owner, Integer number) {
        super(balance, owner, number);
    }

    @Override
    protected boolean checkBefore() {
        return false;
    }

    public Money score() {
        Scanner scanner = new Scanner(System.in);
        double withdraw = scanner.nextDouble();
        this.getMoney(withdraw);
        return this.getMoneyWithoutLess();
    }
}
