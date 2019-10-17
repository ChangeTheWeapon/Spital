
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

public class Farmacie extends Spital {
    private int nrAngajatilor;
    private double oraDeschiderii;
    private double oraInchiderii;
    private int antibiotice;
    private int preparateSistemulNervos;
    private int preparateDermatologice;
    private int vitamine;
    private int preparateSistemulCardiovascular;
    private int antidiabetice;

    Farmacie(String locatia, int nrTelefon, int nrAngajatilor, double oraDeschiderii, double oraInchiderii, int antibiotice, int preparateSistemulNervos, int preparateDermatologice, int vitamine, int preparateSistemulCardiovascular, int antidiabetice) {
        super(locatia, nrTelefon);
        this.nrAngajatilor = nrAngajatilor;
        this.oraDeschiderii = oraDeschiderii;
        this.oraInchiderii = oraInchiderii;
        this.antibiotice = antibiotice;
        this.preparateSistemulNervos = preparateSistemulNervos;
        this.preparateDermatologice = preparateDermatologice;
        this.vitamine = vitamine;
        this.preparateSistemulCardiovascular = preparateSistemulCardiovascular;
        this.antidiabetice = antidiabetice;
    }

    public int getNrAngajatilor() {
        return this.nrAngajatilor;
    }

    public void setNrAngajatilor(int nrAngajatilor) {
        this.nrAngajatilor = nrAngajatilor;
    }

    public double getOraDeschiderii() {
        return this.oraDeschiderii;
    }

    public void setOraDeschiderii(double oraDeschiderii) {
        this.oraDeschiderii = oraDeschiderii;
    }

    public double getOraInchiderii() {
        return this.oraInchiderii;
    }

    public void setOraInchiderii(double oraInchiderii) {
        this.oraInchiderii = oraInchiderii;
    }

    public int getAntibiotice() {
        return this.antibiotice;
    }

    public void setAntibiotice(int antibiotice) {
        this.antibiotice = antibiotice;
    }

    public int getPreparateSistemulNervos() {
        return this.preparateSistemulNervos;
    }

    public void setPreparateSistemulNervos(int preparateSistemulNervos) {
        this.preparateSistemulNervos = preparateSistemulNervos;
    }

    public int getPreparateDermatologice() {
        return this.preparateDermatologice;
    }

    public void setPreparateDermatologice(int preparateDermatologice) {
        this.preparateDermatologice = preparateDermatologice;
    }

    public int getVitamine() {
        return this.vitamine;
    }

    public void setVitamine(int vitamine) {
        this.vitamine = vitamine;
    }

    public int getPreparateSistemulCardiovascular() {
        return this.preparateSistemulCardiovascular;
    }

    public void setPreparateSistemulCardiovascular(int preparateSistemulCardiovascular) {
        this.preparateSistemulCardiovascular = preparateSistemulCardiovascular;
    }

    public int getAntidiabetice() {
        return this.antidiabetice;
    }

    public void setAntidiabetice(int antidiabetice) {
        this.antidiabetice = antidiabetice;
    }

    public String toString() {
        return this.locatia + " " + this.nrTelefon + " " + this.nrAngajatilor + " " + this.oraDeschiderii + " " + this.oraInchiderii + " " + this.antibiotice + " " + this.preparateSistemulNervos + " " + this.preparateDermatologice + " " + this.vitamine + " " + this.preparateSistemulCardiovascular + " " + this.antidiabetice;
    }
}