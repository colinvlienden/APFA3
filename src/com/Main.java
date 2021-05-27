package com;

import java.util.PriorityQueue;

import static java.lang.System.out;

public class Main {
    public static void main(String [] args) {

        //Treinrit
        Treinrit T0 = new Treinrit("Culemborg", "Utrecht", 20);
        Treinrit T1 = new Treinrit("Utrecht", "Amsterdam", 30);

        PriorityQueue<Stap> Treinrit = new PriorityQueue<Stap>();
        Treinrit.add(T0);
        Treinrit.add(T1);
        //System.out.println(Treinrit);


        //Rit
        Rit R0 = new Rit("Culemborg", "Utrecht", 30);

        PriorityQueue<Stap> Rit = new PriorityQueue<Stap>();
        Rit.add(R0);


        //Vlucht
        Vlucht V0 = new Vlucht("Culemborg", "Utrecht", 90, 10);

        PriorityQueue<Stap> Vlucht = new PriorityQueue<Stap>();
        Vlucht.add(V0);
        //System.out.println(Vlucht);


        //Create reis
        Reis trein = new Reis();
        trein.setSteps(Treinrit);

        Reis auto = new Reis();
        auto.setSteps(Rit);

        Reis vliegtuig = new Reis();
        vliegtuig.setSteps(Vlucht);

        /* compare */
        out.println(trein.compareTo(trein));

        trein.compareTo(auto);
        trein.compareTo(vliegtuig);
    }
}
