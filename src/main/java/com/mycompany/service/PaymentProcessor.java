/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.model.Payment;
import com.mycompany.model.Transaction;

public class PaymentProcessor {

    private TransactionHistory transactionHistory;

    public PaymentProcessor(TransactionHistory transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public void processTransaction(String id, double amount, Payment paymentMethod) {
        Transaction transaction = new Transaction(id, amount, paymentMethod);
        transaction.processPayment();
        transactionHistory.addTransaction(transaction);
    }
}
