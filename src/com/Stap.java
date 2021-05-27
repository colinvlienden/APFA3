package com;

public abstract class Stap implements java.lang.Comparable<Stap> {
    private final String start;
    private final String end;

    public Stap(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public abstract int getWeight();

}
