package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome: ");
        String name = scan.nextLine();

        Conto account = new Conto(name);
        System.out.println(account);

        while (true) {
            System.out.println("Scegli un'opzione: ");
            System.out.println("1. Versamento di denaro");
            System.out.println("2. Prelievo di denaro");
            System.out.println("3. Fine operazione");

            int scelta = scan.nextInt();

            if (scelta == 1) {
                System.out.println("Inserire l'importo del versamento:");
                double versamento = scan.nextDouble();
                if (account.depositMoney(versamento)) {
                    System.out.println("Versamento andato a buon fine!");
                    System.out.println("Saldo attuale: " + account.getBalance());
                } else {
                    System.out.println("Ci dispiace, ma la transazione non è andata a buon fine!");
                }
            } else if (scelta == 2) {
                System.out.println("Inserire l'importo da prelevare:");
                double prelievo = scan.nextDouble();
                if (account.withdrawMoney(prelievo)) {
                    System.out.println("Prelievo andato a buon fine");
                    System.out.println("Saldo attuale: " + account.getBalance());
                } else {
                    System.out.println("Ci dispiace, ma la transazione non è andata a buon fine!");
                }
            } else if (scelta == 3) {
                System.out.println("Grazie per averci scelto");
                break;
            }
        }

        scan.close();
    }
}

