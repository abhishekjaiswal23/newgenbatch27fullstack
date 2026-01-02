package org.test.app.newgen.batch;

public class Cucumber {

    // attributes or veribales
    private String wight; /// wight = 250gm ;
    private String color; // color = green
    private int length; // length = 6 cm
    private int quantity; // quantity = 4 kg

    // aplpahnumeric values - 0-9 a - z special char
   private static String fname = " ";// lterals  constant pool store
    byte age = 32; // 0-9  0 to 99
    char ap = 'd';
    String lname = "Jaiswal";

    boolean isDoable = true;


    private boolean test=false;



    // behaviour or method
//    public void canTest(){
//
//    }
    // getting the vlaues getXXXXX
    public String getWight() {
        return wight;
    }

    // setting some values  setXXXXX
    public void setWight(String wight) {
        this.wight = wight;
    }

    // left hand side  = right hand side

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

// data types
       //  primitiv e               non primitive
    // short   = Short                         String
    // byte    = Byte                          array
    // int      == Integer                   Interface
    // float     = Float                       object
    // long      = Long                class
    // char      = CHaracter                 Enum
    // double    = Double
    // boolean      = Boolean


    // Integer
    // Float
    // Double
    // Long



    public static void main(String[] args) {
        Cucumber c = new Cucumber();

        String s = new String("Abc");

            String fname1 = null;

        System.out.println("Output " + fname1.toString());


    }



}
