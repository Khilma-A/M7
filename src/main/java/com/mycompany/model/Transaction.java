package com.mycompany.model;

public class Transaction {

    private String id;
    private double amount;
    private Payment paymentMethod;

    public Transaction(String id, double amount, Payment paymentMethod) {
        this.id = id;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() {
        paymentMethod.pay(amount);
        System.out.println("Transaksi " + id + " berhasil.");
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Jumlah: " + amount + ", Metode: "
                + paymentMethod.getClass().getSimpleName();
    }
}
