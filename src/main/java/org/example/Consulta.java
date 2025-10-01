package org.example;

public abstract class Consulta {
    protected double valorBase;
    protected String id;

    public Consulta(double valorBase, String id){
        this.valorBase = valorBase;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
}


