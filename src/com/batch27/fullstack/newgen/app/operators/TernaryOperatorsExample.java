package com.batch27.fullstack.newgen.app.operators;

public class TernaryOperatorsExample {

    public static void main(String[] args) {

        int a = 10;

        if(a == 10){
            System.out.println("a is 10");
        }else{
            System.out.println("a is not 10");
        }

        // condition ? value_if_true : value_if_false

        String result = (a == 10) ? "a is 10" : "a is not 10";
        System.out.println("Output from ternary : " + result);


    }


}
