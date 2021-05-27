package com;

public class Vlucht extends Stap{
    private Integer expense;

    public Vlucht(String start, String end, Integer expense) {
        super(start, end);
        this.expense = expense;
    }

    public Integer getExpense() {
        return expense;
    }

    @Override
    public String toString() {
        return "Vlucht{" +
                "expense=" + expense +
                '}';
    }
}
