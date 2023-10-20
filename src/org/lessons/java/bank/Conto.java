package org.lessons.java.bank;

import java.util.Random;

public class Conto {

    Random rand = new Random();

    private int countNumber;
    private String accountName;
    private int balance;

    public Conto(String accountName) {
        countNumber = rand.nextInt(1, 1000);
        this.accountName = accountName;
        balance = 0;
    }

    public int getCountNumber() {
        return countNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    public String toString() {
        return "Numero Conto: " + countNumber + "\nNome Conto: " + accountName + "\nSaldo: " + balance;
    }
}
