package com.batch27.fullstack.oop.association.aggregation.composition.example;

public class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void openAccount(Bank bank) {
        System.out.println(name + " opened account in " + bank.bankName);
    }

}
