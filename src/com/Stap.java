package com;

public abstract class Stap implements java.lang.Comparable<Stap> {
    private String start;
    private String end;

    public Stap(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public abstract int getWeight();

}
