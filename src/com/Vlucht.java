package com;

public class Vlucht extends Stap{
    private final int expense;
    private final int lostLuggage;

    public Vlucht(String start, String end, int expense, int lostLuggage) {
        super(start, end);
        this.expense = expense;
        this.lostLuggage = lostLuggage;
    }

    public int getExpense() {
        return expense;
    }

    @Override
    public String toString() {
        return "Vlucht{" +
                "expense=" + expense +
                ", lostLuggage=" + lostLuggage +
                '}';
    }

    @Override
    public int compareTo(Stap o) {
        return 0;
    }
}
