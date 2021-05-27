package com;

public class Rit extends Stap{
    private Integer distance;

    public Rit(String start, String end, Integer distance) {
        super(start, end);
        this.distance = distance;
    }

    public Integer getDistance() {
        return distance;
    }
}
