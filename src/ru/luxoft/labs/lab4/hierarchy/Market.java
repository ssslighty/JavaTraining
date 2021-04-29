package ru.luxoft.labs.lab4.hierarchy;

import ru.luxoft.labs.lab4.hierarchy.valut.Currency;

import java.util.List;

public class Market {
    private Emmitent emmitent;
    private String name;
    private List<Currency> currencyList;

    public Market(String name, Emmitent emmitent, List<Currency> currencyList) {
        this.name = name;
        this.emmitent = emmitent;
        this.currencyList = currencyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Emmitent getEmmitent() {
        return emmitent;
    }

    public void setEmmitent(Emmitent emmitent) {
        this.emmitent = emmitent;
    }

    public List<Currency> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }
}
