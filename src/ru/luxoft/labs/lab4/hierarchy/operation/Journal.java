package ru.luxoft.labs.lab4.hierarchy.operation;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final ArrayList<Operation> operations;

    public Journal() {
        operations = new ArrayList<>();
    }

    public List<Operation> getOperations() {
        return operations;
    }
}
