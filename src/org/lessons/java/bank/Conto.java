package org.lessons.java.bank;

import java.util.Random;

public class Conto {

    Random rand = new Random();

    private int countNumber;
    private String accountName;
    private double balance;

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

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Numero Conto: " + countNumber + "\nNome Conto: " + accountName + "\nSaldo: " + balance;
    }

    public boolean depositMoney(double deposit) {
        balance += deposit;
        return true;
    }

    public boolean withdrawMoney(double money) {
        if (money <= balance) {
            balance -= money;
        } else {
            System.out.println("Saldo insufficiente");
        }
        return true;
    }
}
