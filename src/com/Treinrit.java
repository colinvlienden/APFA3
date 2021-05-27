package com;

public class Treinrit extends Stap{
    private final Integer duration;

    public Treinrit(String start, String end, Integer duration) {
        super(start, end);
        this.duration = duration;
    }

    public Integer getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Treinrit{" +
                "duration=" + duration +
                '}';
    }

    @Override
    public int compareTo(Stap o) {
        return 0;
    }
}
