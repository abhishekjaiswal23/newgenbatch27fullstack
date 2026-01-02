package com.batch27.fullstack.newgen.app.operators;

public class AssignmentOperators {
    public static void main(String[] args) {

        // assignment operator =
        //int a = 10; // assigning value 10 to variable a
//            Operator	Meaning
//                =	    Simple assignment
//                +=	    Add and assign
//                -=	    Subtract and assign
//                *=	    Multiply and assign
//                /=	    Divide and assign
//                %=	    Modulus and assign

    // a + b = total

//                int a = 10;
//                 int b = 5;
//                 a += b;
                //int total = a + b;


                //System.out.println("Total  = " + a);


                // a = a + b  => 10 + 5 = 15

            //System.out.println("a = " + a);


            // left side = right side

           // writing java code left to right
            System.out.println("Assignment Operators Example");
            ///  <<<<<<<<<<<<<<<<<<<<------------------
            // for execution right to left


//        ==	Equal to  // comparing two values memory refrence  vs equals() - contenet
//        !=	Not equal //
//        >	    Greater than
//        <	    Less than
//        >=	Greater or equal
//        <=	Less or equal

        int x = 5;  // assigned veribale x with value 5

        // left side                    right side
        int y              =                x++;     // right side values get assigne to left side // 6

        //int y = x++; // 5

        System.out.println("before : " + x);

        System.out.println("after : " + y); // 5

       // when its increment ? =
        // and when its use or assign ?
///   pre increment                         vs            post increment
//    increased and assigne values                    value increase but not assigned

// pre descrement                         vs            post decrement
//    decreased and assigne values                    value decrease but not assigned

    }
}
