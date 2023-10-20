package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    Random rand = new Random();

    // attributi
    private int codice;
    private String name;
    private String descrizione;
    private double prezzo;
    private int IVA;

    // costruttori

    public Prodotto(String name, String descrizione, int prezzo, int IVA) {
        codice = rand.nextInt(1,500);
        this.name = name;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.IVA = IVA;
    }

    // metodi
    public int getCodice() {
        return codice;
    }
    public String getName() {
        return name;
    }

    public String getCodiceNome() {
        return codice + "-" + name;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getPrezzoIva() {
        double prezzoIva = prezzo * (1 + IVA / 100.0);
        return  prezzoIva;
    }

    public int getIVA() {
        return IVA;
    }

    public String toString() {
        return "Codice: " + codice + "\nNome: " + name + "\nDescrizione: " + descrizione +
                "\nPrezzo: " + prezzo + "\nIVA: " + IVA + "%";
    }

}
