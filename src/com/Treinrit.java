package com;

public class Treinrit extends Stap{
    private Integer duration;

    public Treinrit(String start, String end, Integer duration) {
        super(start, end);
        this.duration = duration;
    }

    public Integer getDuration() {
        return duration;
    }
}
