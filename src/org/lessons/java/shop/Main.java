package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Prodotto playstation5 = new Prodotto("Playstation 5", "La console di ultima generazione", 500, 22);
        System.out.println(playstation5);

        Prodotto galaxyFold = new Prodotto("Samsung Galaxy Fold", "L'ultima uscita della serie galaxy", 1200, 22);
        System.out.println(galaxyFold + " " + "Prezzo con IVA: " + galaxyFold.getPrezzoIva());

        Prodotto laptop = new Prodotto("HP Pavillon", "Dotato di touchscreen", 700, 22 );
        System.out.println(laptop.getCodiceNome() + " " + laptop);
    }
}
