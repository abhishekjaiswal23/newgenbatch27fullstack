package com.batch27.fullstack.newgen.app.loops;

public class LoopExample {

// for loop

    // loop types

    // while loop - done
    // for loop
    // do while loop
    // foreach loop

    // print 1 to 10 numbers
    //System.out.println("Print 1 to 10 numbers");
    public static void main(String[] args) {
        System.out.println("Print 1 to 10 numbers using for loop");

        // while loop example
        int i = 1; // initialization
        //     1  <= 10 ==== true
        //     2  <= 10 ==== true
        //     3  <= 10 ==== true
        // ........
        // 10 <= 10 ==== true
        // 11 <= 10 ==== false
        while (i <= 10) { // condition
            // class    reference    method == cosole output
            // System .    out.         println("i = " + i); // body 10
            i++; // increment 10 + 1 = 11
        }
            // use of while loop in real time application
            // reading data from file until end of file
        // reading data from database until last record


        // array - is storing same type of data in a single variable
        // homogenious data storage - int 1,2,3,4,5,6,7,8,9,10
        // with specific size - static size - once defined cannot be changed

        String s = "Newgen softtech..";

        // for loop example
        for (int j = 1; j <= 10;j++){// initialization
                                   // condition
              // initialization, condition, increment

            System.out.println("j = " + j);



            //System.out.println(j); // body
        }

        System.out.println("Welcome to " + s);

        // foreach loop example
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Black"};
        for (String color : colors) {
            System.out.println("Color: " + color);
        }

        Integer[] numbers = {10, 20, 30, 40, 50};
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }



        // cosole app ----- this one
        // mobile app
        // desktop app
        // web app


        ///  do while loop example -
        int k = 1; // initialization
        do {
            System.out.println("do while loop example k = " + k); // body
            k++; // increment
        } while (k <= 10); // condition


        //  execute first
        // then check condition




// operators -


// while loop dry run
//        Execution Steps (Dry Run)
//        Step 1: Initialize i = 1
//        Step 2: Check condition i <= 5
//        → 1 <= 5 → true → enter loop
//        Step 3: Execute loop body
//        → Print: 1
//        Step 4: Increment i++
//        → i = 2

// for loop dry run

//        Execution Steps (Dry Run)
//        Step 1: Initialize i = 1
//      → Before first iteration.
//        Step 2: Check condition i <= 5
//      → 1 <= 5 → true → enter loop.
//        Step 3: Execute loop body
//      →  Print: 1
//        Step 4: Increment i++
//          → i = 2


    }

}
