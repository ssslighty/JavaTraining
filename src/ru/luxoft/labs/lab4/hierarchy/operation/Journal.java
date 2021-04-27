package ru.luxoft.labs.lab4.hierarchy.operation;

import java.util.ArrayList;

public class Journal {
    private ArrayList<Operation> operations;

    public Journal() {
        operations = new ArrayList<Operation>();
    }
    public ArrayList<Operation> getOperations() {
        return operations;
    }
}
