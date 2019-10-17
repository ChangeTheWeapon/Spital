// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

public class Spital {
    protected String locatia;
    protected int nrTelefon;

    Spital(String locatia, int nrTelefon) {
        this.locatia = locatia;
        this.nrTelefon = nrTelefon;
    }

    public String getLocatia() {
        return this.locatia;
    }

    public int getNrTelefon() {
        return this.nrTelefon;
    }

    public void setLocatia(String locatia) {
        this.locatia = locatia;
    }

    public void setNrTelefon(int nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String toString() {
        return this.nrTelefon + " " + this.locatia;
    }
}
