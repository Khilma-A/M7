package com.mycompany.model;

public class BankTransferPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Membayar " + amount + " menggunakan Transfer Bank.");
    }
}
