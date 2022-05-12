package com.utm;
interface Inregistreaza {
    public void inregistr(int nr_candidat, String partid);
}

class candidatIndependent implements Inregistreaza {
    @Override
    public void inregistr(int nr_candidat,  String partid) {
        System.out.println("Nr candidatului: " + nr_candidat +
                " partidul:" + partid);
    }
}

class candidatDependent implements Inregistreaza {
    @Override
    public void inregistr(int nr_candidat, String partid) {
        System.out.println("Nr candidatului: " + nr_candidat +
                " partidul:" + partid);
    }
}
abstract class Candidat {
    protected Inregistreaza inregistreaza;

    protected Candidat(Inregistreaza inregistreaza) {
        this.inregistreaza = inregistreaza;
    }
    abstract void inregistr();
}
class Candidat1 extends Candidat{
    private int nr_candidat;
    private String partid;

    public Candidat1(int nr_candidat,  String partid, Inregistreaza inregistreaza) {
        super(inregistreaza);
        this.nr_candidat = nr_candidat;
        this.partid = partid;
    }

    public void inregistr() {
        inregistreaza.inregistr(nr_candidat, partid);
    }
}


public class Bridge {

    public static void main(String[] args) {
        Candidat candidat_dependent = new Candidat1(1, "Partid1", new candidatDependent());
        Candidat candidat_independent = new Candidat1(2,"FaraPartid", new candidatIndependent());

        candidat_dependent.inregistr();
        candidat_independent.inregistr();
    }
}