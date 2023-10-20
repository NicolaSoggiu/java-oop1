package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome: ");
        String name = scan.nextLine();

        Conto account = new Conto(name);
        System.out.println(account);


        scan.close();
    }
}
