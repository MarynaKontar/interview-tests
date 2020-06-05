package com.example.interviewtests;


public class OrderOfInitializationTest {

    public static void main(String[] args) {
//        OrderOfInitializationSubclassTwoClass sub2 = new OrderOfInitializationSubclassTwoClass("SUB21", "SUB22");
        OrderOfInitializationSubclassTwoClass sub21 = new OrderOfInitializationSubclassTwoClass();
        System.out.println("===================================");
//        OrderOfInitializationSubclassOneClass sub1 = new OrderOfInitializationSubclassOneClass("SUB11", "SUB12");
        OrderOfInitializationSubclassOneClass sub11 = new OrderOfInitializationSubclassOneClass();


    }
}


//        Parent static block
//        Subclass Two static block
//        Parent instance blocknullnull
//        empty parent constructor
//        Subclass Two instance blocknullnull
//        empty Subclass Two constructor
//        ===================================
//        Subclass One static block
//        Parent instance blocknullnull
//        empty parent constructor
//        Subclass One instance blocknullnull
//        empty Subclass One constructor