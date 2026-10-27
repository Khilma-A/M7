package com.mycompany.model;

public class EWalletPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Membayar " + amount + " menggunakan E-Wallet.");
    }
}
