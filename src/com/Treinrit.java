package com;

public class Treinrit extends Stap{
    private final int duration;

    public Treinrit(String start, String end, int duration) {
        super(start, end);
        this.duration = duration;
    }

    @Override
    public int getWeight() {
        return duration;
    }

    @Override
    public int compareTo(Stap o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Treinrit{" +
                "duration=" + duration +
                '}';
    }

}
