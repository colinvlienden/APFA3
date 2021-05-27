package com;

public class Rit extends Stap{
    private final int distance;

    public Rit(String start, String end, int distance) {
        super(start, end);
        this.distance = distance;
    }

    @Override
    public int getWeight() {
        return distance;
    }

    @Override
    public int compareTo(Stap o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Rit{" +
                "distance=" + distance +
                '}';
    }
}
