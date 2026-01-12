package com.batch27.fullstack.oop.association.aggregation.composition.example;

public class Accounts {
    private final Transactions transaction; // final = wont change after initialized.
    Accounts() {
        System.out.println("Accounts created....");
         transaction = new Transactions(); // created inside
    }
}
