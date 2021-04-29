package ru.luxoft.labs.lab5.model.money;

public interface MoneyInterface {
    void addMoney(Money money);

    Money getMoney(double balanceLess);

    Money getMoneyWithoutLess();
}
