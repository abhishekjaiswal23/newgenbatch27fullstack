package com.batch27.fullstack.oop.association.aggregation.composition.example;

public class TestAssociation {

    public static void main(String[] args) {
        Bank bank = new Bank("HDFC");// passing bank here
        Customer customer = new Customer("Abhishek");

        customer.openAccount(bank);
    }

}
