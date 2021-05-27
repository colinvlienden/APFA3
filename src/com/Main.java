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

        //Vlucht
        Vlucht V0 = new Vlucht("Culemborg", "Utrecht", 20);
        Vlucht V1 = new Vlucht("Utrecht", "Amsterdam", 20);

    }
}
