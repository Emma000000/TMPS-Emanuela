package com.company;
class Alegeri implements Cloneable {
    private int Nr_canditati;
    private int Nr_partide;
    public Alegeri() {
        Nr_canditati = 7;
        Nr_partide = 5;
    }

    public Alegeri clone() {
        return new Alegeri();
    }

    public void makeAdvanced() {
        Nr_partide = 10;
        Nr_canditati = 11;
    }
    public int getModel(){
        return Nr_canditati;
    }
}

public class Prototype {
    public Alegeri makeJaguar(Alegeri alegeriSimple) {
        alegeriSimple.makeAdvanced();
        return alegeriSimple;
    }
    public static void main(String args[]){
        Alegeri alegeri = new Alegeri();
        Alegeri alegeriSimple = alegeri.clone();
        Prototype workShop = new Prototype();
        Alegeri alegeriFinale = workShop.makeJaguar(alegeriSimple);
        System.out.println("Nr canditati alegeri finale "+alegeriFinale.getModel());
    }
}