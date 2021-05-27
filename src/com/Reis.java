package com;

import java.util.PriorityQueue;

public class Reis implements Comparable<Reis> {

    private PriorityQueue<Stap> steps;

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
            System.out.println("Korter");
            return 1;
        }
        else if(reis1 > reis2){
            System.out.println("Groter");
            return 1;
        }
        else {
            System.out.println("Er is iets mis gegaan");
            return 1;
        }
    }

}