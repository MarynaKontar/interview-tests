package com.example.interviewtests;

public class FinalMethodTest {
//    https://stackabuse.com/non-access-modifiers-in-java/
//    Preventing Overriding method with final modifier
//    If you specify the final modifier while defining a method, any future subclass can't override it.

    final void printSomething() {
        System.out.println("Something ");
    }

    public static void main(String[] args) {
        ExtendsFinalExample extendsFinalExample = new ExtendsFinalExample();
        extendsFinalExample.printSomething("effretrgtrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
    }
}


class ExtendsFinalExample extends FinalMethodTest {
    // This would cause a compile-time error
//    void printSomething() {
//      System.out.println("Some other thing");
//    }

    // However, you are perfectly free to overload this method
    void printSomething(String something) {
        printSomething();
        System.out.println(something);
    }
}