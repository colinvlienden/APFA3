package com;

import java.util.PriorityQueue;

public class Reis implements Comparable<Reis> {

    private String name;
    private PriorityQueue<Stap> steps;

    public Reis(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSteps(PriorityQueue<Stap> steps) {
        this.steps = steps;
    }

    private int getTotalWeight() {
        return steps.stream().mapToInt(Stap::getWeight).sum();
    }

    @Override
    public int compareTo(Reis reis) {
        int reis1 = steps.stream().mapToInt(Stap::getWeight).sum();
        int reis2 = reis.getTotalWeight();

        if (reis1 < reis2){
            System.out.println("De " + this.getName() + " is korter dan de " + reis.getName());
            return 1;
        }
        else if(reis1 > reis2){
            System.out.println("De " + this.getName() + " is langer dan de " + reis.getName());
            return 1;
        }
        else {
            System.out.println("De " + this.getName() + " is gelijk aan de " + reis.getName());
            return 1;
        }
    }

}