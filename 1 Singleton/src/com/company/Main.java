package com.company;

public class Main {

    public static void main(String[] args) {
        vizualizareStatus voturi = vizualizareStatus.primesteDate();
        voturi.afiseazaDate();
    }

}

class vizualizareStatus{
    private static vizualizareStatus date;

    public static vizualizareStatus primesteDate(){
        if(date != null) {
            return date;
        };
        return new vizualizareStatus();
    }

    public  void afiseazaDate(){
        System.out.println("Persoana a votat o singura data");
    }

}

