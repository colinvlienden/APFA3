package com;

public class Rit extends Stap{
    private final Integer distance;

    public Rit(String start, String end, Integer distance) {
        super(start, end);
        this.distance = distance;
    }

    public Integer getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Rit{" +
                "distance=" + distance +
                '}';
    }

    @Override
    public int compareTo(Stap o) {
        return 0;
    }
}
