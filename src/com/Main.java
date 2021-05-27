package com;

import java.util.PriorityQueue;

public class Main {
    public static void main(String [] args) {

        //Treinrit
        Treinrit T0 = new Treinrit("Culemborg", "Utrecht", 20);
        Treinrit T1 = new Treinrit("Utrecht", "Amsterdam", 20);

        PriorityQueue<Stap> reisA = new PriorityQueue<>();
        reisA.add(T0);
        reisA.add(T1);
        System.out.println(reisA);

        //Rit
        Rit R0 = new Rit("Culemborg", "Utrecht", 20);
        Rit R1 = new Rit("Utrecht", "Amsterdam", 20);

        PriorityQueue<Stap> reisB = new PriorityQueue<>();
        reisB.add(R0);
        reisB.add(R1);
        System.out.println(reisB);

        //Vlucht
        Vlucht V0 = new Vlucht("Culemborg", "Utrecht", 20, 2);
        Vlucht V1 = new Vlucht("Utrecht", "Amsterdam", 20, 2);

        PriorityQueue<Stap> reisC = new PriorityQueue<>();
        reisC.add(V0);
        reisC.add(V1);
        System.out.println(reisC);
    }
}
