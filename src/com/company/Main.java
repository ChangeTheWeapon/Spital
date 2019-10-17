// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Spital SfantulMihail = new Spital("str. Mihai Eminescu 1/8 ", 22120001);
        SectiaAnatomiePatologica Anatomie = new SectiaAnatomiePatologica("Mihai Eminescu 1/8", 22120002, 6, "Vieru D.", 13, 5, 72, 59);
        Farmacie Sante = new Farmacie("str. Mihai Eminescu 1/8 ", 22150006, 3, 8.0D, 21.0D, 54, 48, 36, 23, 46, 9);
        System.out.println(SfantulMihail);
        System.out.println(Anatomie);
        System.out.println(Sante);
    }
}