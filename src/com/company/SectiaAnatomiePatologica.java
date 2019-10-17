//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

public class SectiaAnatomiePatologica extends Spital {
    private int nrDeMedici;
    private String medicSef;
    private int nrDecedatilor;
    private int nrCabinete;
    private int nrLocuriTotale;
    private int nrLocuriLibere;

    SectiaAnatomiePatologica(String locatia, int nrTelefon, int nrDeMedici, String medicSef, int nrDecedatilor, int nrCabinete, int nrLocuriTotale, int nrLocuriLibere) {
        super(locatia, nrTelefon);
        this.nrDeMedici = nrDeMedici;
        this.medicSef = medicSef;
        this.nrDecedatilor = nrDecedatilor;
        this.nrCabinete = nrCabinete;
        this.nrLocuriLibere = nrLocuriLibere;
        this.nrLocuriTotale = nrLocuriTotale;
    }

    public int getNrDeMedici() {
        return this.nrDeMedici;
    }

    public void setNrDeMedici(int nrDeMedici) {
        this.nrDeMedici = nrDeMedici;
    }

    public String getMedicSef() {
        return this.medicSef;
    }

    public void setMedicSef(String medicSef) {
        this.medicSef = medicSef;
    }

    public int getNrDecedatilor() {
        return this.nrDecedatilor;
    }

    public void setNrDecedatilor(int nrDecedatilor) {
        this.nrDecedatilor = nrDecedatilor;
    }

    public int getNrCabinete() {
        return this.nrCabinete;
    }

    public void setNrCabinete(int nrCabinete) {
        this.nrCabinete = nrCabinete;
    }

    public int getNrLocuriTotale() {
        return this.nrLocuriTotale;
    }

    public void setNrLocuriTotale(int nrLocuriTotale) {
        this.nrLocuriTotale = nrLocuriTotale;
    }

    public int getNrLocuriLibere() {
        return this.nrLocuriLibere;
    }

    public void setNrLocuriLibere(int nrLocuriLibere) {
        this.nrLocuriLibere = nrLocuriLibere;
    }

    public String toString() {
        return this.locatia + " " + this.nrTelefon + " " + this.nrDeMedici + " " + this.medicSef + " " + this.nrDecedatilor + " " + this.nrCabinete + " " + this.nrLocuriLibere + " " + this.nrLocuriTotale;
    }
}
