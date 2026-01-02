package com.batch27.fullstack.newgen.app;

public class ControlStatment {

    //
    // provide if else example
    public static void main(String[] args) {

        // check if number is positive, negative or zero
        // how to use if else in banking domain application
       // for saving account minimum balance should be 5000
        // elseif block also add
        int accountBalance = -3000;
        if(accountBalance >= 5000){
            System.out.println("You can withdraw cash");
        } else if(accountBalance > 0 && accountBalance < 5000){
            System.out.println("Your balance is low, please deposit money");
        } else {
            System.out.println("Your account is overdrawn, please contact bank");
        }

    }

}
