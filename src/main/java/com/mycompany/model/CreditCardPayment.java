package com.mycompany.model;

public class CreditCardPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Membayar " + amount + " menggunakan Kartu Kredit.");
    }
}
