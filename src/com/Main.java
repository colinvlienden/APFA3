package com;

public class Main {
    public static void main(String [] args) {

        //Treinrit
        Treinrit T0 = new Treinrit("Culemborg", "Utrecht", 20);
        Treinrit T1 = new Treinrit("Utrecht", "Amsterdam", 20);
        System.out.println(T0);
        System.out.println(T1);

        //Rit
        Rit R0 = new Rit("Culemborg", "Utrecht", 20);
        Rit R1 = new Rit("Utrecht", "Amsterdam", 20);
        System.out.println(R0);
        System.out.println(R1);

        //Vlucht
        Vlucht V0 = new Vlucht("Culemborg", "Utrecht", 20);
        Vlucht V1 = new Vlucht("Utrecht", "Amsterdam", 20);
        System.out.println(V0);
        System.out.println(V1);
    }
}
