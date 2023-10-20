package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il nome del prodotto: ");
        String name = scan.nextLine();
        System.out.println("Inserisci la descrizione del prodotto: ");
        String description = scan.nextLine();
        System.out.println("Inserisci il prezzo del prodotto: ");
        int price = scan.nextInt();
        System.out.println("Inserisci IVA del prodotto: ");
        int IVA = scan.nextInt();

        Prodotto product = new Prodotto(name, description, price, IVA);
        String finalProduct =   product.getName() + product.getDescrizione() +
                                product.getPrezzo() + product.getIVA();

        System.out.println( product.getCodice() + finalProduct);


        scan.close();
    }
}
