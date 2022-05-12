package com.utm;

class RegistruImprumut{}

class Carte{
    String nume;
};

class Bibliotecar{
    RegistruImprumut registruImprumut;

    Bibliotecar() {
        registruImprumut = new RegistruImprumut();
    }

    void inregistreazaImprumut(Carte carte) {
        System.out.println("Cartea " + carte.nume + " inregistrata in registru de imprumut.");
    }
};

class Client{
    Carte carte;
    Client() {
        carte = new Carte();
    }

    void imprumutaCarte(String carteNume) {
        carte.nume = carteNume;
        new ImprumutCarte().imprumuta(carte);
    }
};

class ImprumutCarte{
    Bibliotecar bibliotecar;

    ImprumutCarte() {
        bibliotecar = new Bibliotecar();
    }

    void imprumuta(Carte carte) {
        bibliotecar.inregistreazaImprumut(carte);
    }
};

class Facade {;

    public static void main(String[] args) {
        Client client = new Client();
        client.imprumutaCarte("Ion Creanga");
    }

}

