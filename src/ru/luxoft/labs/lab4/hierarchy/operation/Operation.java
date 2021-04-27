package ru.luxoft.labs.lab4.hierarchy.operation;

//import ru.luxoft.labs.lab4.hierarchy.Emmitent;

public class Operation {
    OperType operType;
    private String name;
    private ru.luxoft.labs.lab4.hierarchy.Emmitent emmitent;

    public Operation(OperType operType, String name, ru.luxoft.labs.lab4.hierarchy.Emmitent emmitent) {
        operType = operType;
        this.name = name;
        this.emmitent = emmitent;
    }
    public OperType getOperType() {
        return operType;
    }
    public void setOperType(OperType operType) {
        operType = operType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ru.luxoft.labs.lab4.hierarchy.Emmitent getEmmitent() {
        return emmitent;
    }
    public void setEmmitent(ru.luxoft.labs.lab4.hierarchy.Emmitent emmitent) {
        this.emmitent = emmitent;
    }
}
