package com;

import java.util.Random;

public class Vlucht extends Stap{
    private final int expense;

    //lostLuggage
    private final int priceLostLuggage;

    Random rand = new Random();
    //1 out of 50 lost Luggage
    boolean val = rand.nextInt(50)==0;

    public Vlucht(String start, String end, int expense, int priceLostLuggage) {
        super(start, end);
        this.expense = expense;
        this.priceLostLuggage = priceLostLuggage;
    }

    @Override
    public int getWeight() {
        //check lost luggage
        if (val){
            return expense + priceLostLuggage;
        }
        else{
            return expense;
        }
    }

    @Override
    public int compareTo(Stap o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Vlucht{" +
                "expense=" + expense +
                ", priceLostLuggage=" + priceLostLuggage +
                ", val=" + val +
                ", Total price=" + getWeight() +
                '}';
    }
}
