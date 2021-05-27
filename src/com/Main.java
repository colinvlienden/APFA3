package com;

import java.util.PriorityQueue;

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
        Rit R0 = new Rit("Culemborg", "Amsterdam", 40);

        PriorityQueue<Stap> Rit = new PriorityQueue<Stap>();
        Rit.add(R0);


        //Vlucht 1 op 50 kans dat de bagage kwijt raakt
        Vlucht V0 = new Vlucht("Culemborg", "Amsterdam", 75, 125);

        PriorityQueue<Stap> Vlucht = new PriorityQueue<Stap>();
        Vlucht.add(V0);
        //System.out.println(Vlucht);


        //Create reis
        Reis trein = new Reis("Treinrit");
        trein.setSteps(Treinrit);

        Reis auto = new Reis("Rit");
        auto.setSteps(Rit);

        Reis vliegtuig = new Reis("Vlucht");
        vliegtuig.setSteps(Vlucht);

        // compare
        int check0 = trein.compareTo(auto);
        int check1 = trein.compareTo(vliegtuig);
        int check2 = auto.compareTo(vliegtuig);

    }
}
